/*
package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ16234_wooseok {

    // 방향 배열: 상하좌우 이동을 나타냄
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] map; // 인구 수를 저장하는 지도
    static boolean[][] visited; // 방문 여부를 기록하는 배열
    static int N, L, R, day; // 지도 크기 N, 최소 인구 차 L, 최대 인구 차 R, 날짜(day)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 첫 번째 줄 입력: N, L, R
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[N][N]; // N x N 크기의 지도 생성

        // 지도 데이터 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 인구 이동 시뮬레이션 실행
        while (move()) {
            day++; // 인구 이동이 발생할 때마다 날짜 증가
        }
        System.out.println(day); // 모든 이동이 종료된 후 총 날짜 출력
    }

    // 인구 이동을 수행하는 메서드
    private static boolean move() {
        boolean flag = false; // 인구 이동 발생 여부
        visited = new boolean[N][N]; // 방문 여부 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 방문하지 않은 국가에 대해 BFS 실행
                if (!visited[i][j]) {
                    if (bfs(i, j)) { // BFS 결과 인구 이동 발생 시
                        flag = true; // 플래그 true로 설정
                    }
                }
            }
        }
        return flag; // 인구 이동 발생 여부 반환
    }

    // BFS를 통해 연합을 형성하고 인구 이동 처리
    private static boolean bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>(); // BFS 탐색용 큐
        ArrayList<int[]> union = new ArrayList<>(); // 연합에 포함된 국가 좌표 리스트
        queue.add(new int[]{x, y}); // 시작점 큐에 추가
        union.add(new int[]{x, y}); // 시작점 연합에 추가
        visited[x][y] = true; // 시작점 방문 처리

        int sum = map[x][y]; // 연합의 총 인구수

        // BFS 탐색
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            // 상하좌우 인접 국가 탐색
            for (int d = 0; d < 4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];

                // 지도 범위를 벗어나지 않고, 방문하지 않았으며, 인구 차 조건을 만족하는 경우
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                    int diff = Math.abs(map[cx][cy] - map[nx][ny]); // 인구 차 계산
                    if (diff >= L && diff <= R) { // 인구 차가 조건을 만족하면
                        visited[nx][ny] = true; // 방문 처리
                        queue.add(new int[]{nx, ny}); // 큐에 추가
                        union.add(new int[]{nx, ny}); // 연합에 추가
                        sum += map[nx][ny]; // 연합 총 인구수 업데이트
                    }
                }
            }
        }

        // 연합의 크기가 2 이상인 경우 인구 이동 발생
        if (union.size() > 1) {
            int avg = sum / union.size(); // 연합 내 국가들의 평균 인구 계산
            for (int[] pos : union) {
                map[pos[0]][pos[1]] = avg; // 연합 내 모든 국가에 평균 인구 할당
            }
            return true; // 인구 이동 발생
        }
        return false; // 인구 이동 없음
    }
}
*/
package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ16234_wooseok {

    // 상하좌우 이동을 나타내는 방향 배열
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int[][] map; // 국가별 인구수를 저장하는 지도
    static boolean[][] visited; // 방문 여부를 저장하는 배열
    static int N, L, R, day; // 지도 크기 N, 최소 인구 차 L, 최대 인구 차 R, 총 날짜(day)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 처리: N, L, R
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        map = new int[N][N]; // N x N 크기의 지도 생성

        // 지도 데이터 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 인구 이동 시뮬레이션
        while (simulatePopulationMovement()) {
            day++; // 인구 이동이 발생할 때마다 날짜 증가
        }

        // 총 날짜 출력
        System.out.println(day);
    }

    // 인구 이동을 시뮬레이션하는 메서드
    private static boolean simulatePopulationMovement() {
        visited = new boolean[N][N]; // 방문 배열 초기화
        boolean hasMoved = false; // 인구 이동 여부 확인 플래그

        // 모든 좌표를 순회하며 연합 탐색
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    // DFS로 연합을 형성하고 인구 이동 처리
                    ArrayList<int[]> union = new ArrayList<>();
                    int totalPopulation = exploreUnion(i, j, union);

                    // 연합의 크기가 2 이상인 경우 인구 이동 발생
                    if (union.size() > 1) {
                        redistributePopulation(union, totalPopulation);
                        hasMoved = true;
                    }
                }
            }
        }
        return hasMoved;
    }

    // DFS로 연합을 형성하고 연합 내 총 인구수를 반환
    private static int exploreUnion(int x, int y, ArrayList<int[]> union) {
        visited[x][y] = true; // 방문 처리
        union.add(new int[]{x, y}); // 현재 좌표를 연합에 추가
        int totalPopulation = map[x][y]; // 현재 좌표의 인구수

        // 상하좌우 인접 국가 탐색
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 유효한 좌표인지 확인
            if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny]) {
                int diff = Math.abs(map[x][y] - map[nx][ny]); // 인구 차 계산
                // 인구 차가 조건(L 이상 R 이하)을 만족하는 경우
                if (diff >= L && diff <= R) {
                    totalPopulation += exploreUnion(nx, ny, union); // 재귀 호출로 연합 확장
                }
            }
        }
        return totalPopulation; // 연합 내 총 인구수 반환
    }

    // 연합 내 모든 국가에 평균 인구수 재분배
    private static void redistributePopulation(ArrayList<int[]> union, int totalPopulation) {
        int averagePopulation = totalPopulation / union.size(); // 연합의 평균 인구수 계산
        for (int[] pos : union) {
            map[pos[0]][pos[1]] = averagePopulation; // 평균 인구수로 업데이트
        }
    }
}
