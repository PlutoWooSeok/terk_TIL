package doitAlgorithm.chapert01.problem.l1_2;

import java.util.Scanner;

/*
가우스 덧셈을 수식으로 정리해보자
a ~ b까지의 숫자를 더한 합은?
처음 숫자와, 마지막 숫자를 더한 합 = ( a + b )
더할 숫자의 개수 총합의 1/2 = ( b - a + 1) * 1/2
= ( a + b ) *  ( b - a + 1) * 1/2
 */

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 n을 입력하시오 : ");
        int n = sc.nextInt();

        //처음 숫자 + 마지막 숫자 합
        int startEndSum = 1 + n;

        //반복 횟수 --> n이 짝수/홀수 일 때, 나눠서 계산
        int count = count = n/2;;
        //짝수 일 때,
        if (n%2 == 0){
            startEndSum = startEndSum * count;
        }

        //홀수 일 때,
        else {
            startEndSum = (startEndSum * count) + (n/2);
        }

        System.out.println("가우스의 덧셈 결과 : " + startEndSum);
    }
}
