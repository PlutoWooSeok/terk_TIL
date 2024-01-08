package doitAlgorithm.chapert01.problem.l2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("양의 정숫값의 자릿수를 구합니다.");

        int n;
        do {
            System.out.print("정숫값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int no = 0;         // 자릿수
        while (n > 0) {
            n /= 10;         // n을 10으로 나눕니다
            no++;
        }

        System.out.println("그 수는 " + no + "자리입니다.");
    }
}

