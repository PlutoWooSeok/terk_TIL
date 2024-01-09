package codingTest;

import java.util.Scanner;

public class Baekjoon_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String st = sc.next();
            String[] strArr = st.split("");
            System.out.println(strArr[0]+strArr[strArr.length-1]);
        }


    }
}
