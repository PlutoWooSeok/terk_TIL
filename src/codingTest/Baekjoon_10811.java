package codingTest;

import java.util.Scanner;

public class Baekjoon_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   //바구니 개수
        int M = sc.nextInt();   //횟수

        int[] basket = new int[N];

        //최초 바구니 번호 초기화
        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            while (a < b) {
                int temp = basket[a];
                basket[a++] = basket[b];
                basket[b--] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i]);
        }



    }
}
