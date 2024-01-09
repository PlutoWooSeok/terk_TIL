package codingTest;

import java.util.Scanner;

public class Baekjoon_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arrStr =  str.split("");

        int N = sc.nextInt();

        System.out.println(arrStr[N-1]);

    }
}
