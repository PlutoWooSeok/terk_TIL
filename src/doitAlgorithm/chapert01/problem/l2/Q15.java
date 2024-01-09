package doitAlgorithm.chapert01.problem.l2;

import java.util.Scanner;

public class Q15 {
    static void triangleB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void triangleU(int n) {
        for (int i = n ; i>0 ; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    //--- 오른쪽 위가 직각인 직각삼각형을  출력 ---//
    static void triangleRU(int n) {
        for (int i = 1; i <= n; i++) {            // i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= i - 1; j++)         // i - 1 개의 ' '을  출력
                System.out.print(' ');
            for (int j = 1; j <= n - i + 1; j++)   // n - i + 1 개의 '*'을  출력
                System.out.print('*');
            System.out.println();                  // 줄바꿈
        }
    }

    //--- 오른쪽 아래가 직각인 직각삼각형을  출력 ---//
    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {            // i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= n - i; j++)         // n - i 개의 ' '을  출력
                System.out.print(' ');
            for (int j = 1; j <= i; j++)            // i 개의 '*'을  출력
                System.out.print('*');
            System.out.println();                  // 줄바꿈
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        triangleB(n);
        triangleU(n);
        triangleRU(n);
        triangleRB(n);
    }
}
