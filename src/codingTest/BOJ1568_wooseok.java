package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class cctv {
    int x,y, type;

    public cctv(int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
}

public class BOJ1568_wooseok {
    public static int N, M;
    public static int[][] map;
    public static int[][] copyMap;
    public static int[] output;
    public static ArrayList<cctv> cctvList;

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};

    public static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        map = new int[N][M];
        cctvList = new ArrayList<>();

        // N행 M열의 맵 정보를 입력받음
        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(input[j]);

                // CCTV를 발견하면 CCTV 리스트에 추가
                if (map[i][j] >= 1 && map[i][j] <= 5) {
                    cctvList.add(new cctv(i, j, map[i][j]));
                }
            }
        }

        //cctc의 방향 경우의 수를 계산할 배열 초기화
        output = new int[cctvList.size()];

        // 경우의 수를 계산하는 함수 호출
        dfs(0);

        // 최종적으로 계산된 최소 사각지대 크기를 출력
        System.out.println(answer);
    }

    private static void dfs(int depth) {
        if (depth == cctvList.size()) {
            // 모든 cctv의 방향이 결정된 경우 감시 영역을 계산
            check();
            return;
        }

        //cctv 종류에 따라 감시가 가능한 방향을 설정하고 탐색
        cctv cctv = cctvList.get(depth);
        int type = cctv.type;

        //각 cctv의 타입에 따라 가능한 방향의 경우의 수 처리
        for (int i = 0; i < 4; i++) {
            output[depth] = i;
            dfs(depth + 1);
        }
    }

    private static void check() {
        // 현재 맵을 복사하여 새로운 맵을 생성
        copyMap = new int[N][M];

        //기존 map을 copyMap으로 복사( 감시 영역 계산 전 원본을 보존하기 위해)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                copyMap[i][j] = map[i][j];
            }
        }


        //모든 cctv에 대한 감시 영역을 설정
        for (cctv cctv : cctvList) {
            int type = cctv.type;
            int x = cctv.x;
            int y = cctv.y;

            //각 cctv의 유형에 따른 감시 방향 설정
            switch (type) {
                case 1: // 한 방향으로만 감시 (상, 우, 하, 좌)
                    for (int i = 0; i < 4; i++) {
                        watch(x, y, i);
                    }
                break;
                case 2: // 두 방향 (상하, 좌우)
                    watch(x, y, 0); // 상
                    watch(x, y, 2); // 하
                break;
                case 3: // 직각 방향 (상우, 우하, 하좌, 좌상)
                    watch(x, y, 0); // 상
                    watch(x, y, 1); // 우
                break;
                case 4: // 세 방향
                    watch(x, y, 0); // 상
                    watch(x, y, 1); // 우
                    watch(x, y, 2); // 하
                break;
                case 5: // 네 방향 모두 감시
                    for (int i = 0; i < 4; i++) {
                        watch(x, y, i);
                    }
                break;
            }
        }

        //사각지대 크기 계산
        int blindSpot = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                //사각지대는 0으로 나타난 구역
                if (copyMap[i][j] == 0) {
                    blindSpot++;
                }
            }
        }

        //최소 사각지대 크기로 answer 업데이트
        answer = Math.min(answer, blindSpot);
    }

    private static void watch(int x, int y, int dir) {
        //방향 배열 dx, dy를 이용하여 cctv가 감시할 수 있는 범위 확장
        while (true) {
            x += dx[dir];
            y += dy[dir];

            //맵 밖으로 나가면 종료
            if (x < 0 || y < 0 || x >= N || y >= M) break;

            //벽(6)을 만나면 종료
            if (map[x][y] == 6) break;

            //cctv의 감시 영역을 7로 표시(감시 영역 표시)
            if (copyMap[x][y] == 0) {
                copyMap[x][y] = 7;
            }
        }
    }


}




