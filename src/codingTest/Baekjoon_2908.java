package codingTest;

import java.util.Scanner;

public class Baekjoon_2908 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        System.out.print(A > B ? A : B);
    }
}


/*
이 문제에서는 StringBuilder를 사용했다.

먼저 StringBuilder 는 문자열을 다루는 클래스로 많이 쓰이고 있는데, 여기서 reverse() 라는 아주 좋은 메소드를 포함하고 있다.
즉, 위를 사용하기 위해 먼저 StringBuilder 생성과 동시에 append() 라는 메소드에 값을 넣어준다.

이때 append() 로 넣어진 값은 타입이 StringBuilder 라는 타입으로 변환된다.
그리고 그렇게 저장된 수를 reverse() 라는 메소드를 통해 저장되어있던 문자열을 뒤집는다. 그리고 StringBuilder 타입을 문자열로 반환시키기 위해 toString() 을 써주면 끝이다.
그리고 문자열로 반환시켰으니 Integer.parseInt() 로 String 을 int 로 타입을 변경시키면 끝이다.
그렇게 뒤집힌 값은 출력에서 A 와 B 중 큰 값이 출력되도록 하면 끝난다.
*/