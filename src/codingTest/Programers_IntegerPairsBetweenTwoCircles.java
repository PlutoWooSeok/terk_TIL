package codingTest;

public class Programers_IntegerPairsBetweenTwoCircles {
    public long solution(int r1, int r2) {
        long answer = 0;

        for(int x=1;x<=r2;x++){
            long minH = (long)Math.ceil(Math.sqrt(1.0*r1*r1 - 1.0*x*x));
            long maxH = (long)Math.floor(Math.sqrt(1.0*r2*r2 - 1.0*x*x));

            answer += (maxH - minH +1);
        }

        return answer*4;
    }
}
/*
이 문제는 원의 방정식을 이용하면 풀 수 있습니다.

원의 방정식은 x^2 + y^2 = r^2입니다. 이 때 원의 방정식에서 특정 x값에서의 y값을 구하고 싶을 경우 y = sqrt(r^2 - x^2)의 식을 통해 구할 수 있습니다.
여기서 두 원 r1과 r2가 있을 경우 두 원에서 특정 x값에서의 y값을 각각 구한 후 큰 값에서 작은 값을 빼면 두 원 사이에 존재하는 점의 개수가 나타납니다.

여기서 주의할 점은 정수 쌍을 어떻게 구하느냐입니다. 정수 쌍은 다음의 개념으로 접근할 수 있습니다. 먼저 작은 원의 경우 현재 위치보다 큰 값이 개수에 포함되기 때문에 구한 값을 올림 처리합니다.
반대로 큰 원의 경우 현재 위치보다 작은 값이 개수에 포함되기 때문에 구한 값을 내림 처리합니다.

그럼 이 방식을 토대로 다시 문제를 접근해보겠습니다. 문제 예시를 보시면 5개씩 모든 사분면이 동일한 위치에 동일한 개수를 갖는 것을 확인할 수 있습니다.
즉 경계값인 x축 또는 y축을 하나씩만 고려해야하기 때문에 0부터 탐색할 경우 축 경계에서의 값이 중복 처리가 됩니다.

따라서 1부터 큰 원의 반지름까지의 x 범위를 설정하여 해당 x값에 따른 y값의 차이를 계속 더해 결과에 4배를 리턴하면 됩니다.

 */