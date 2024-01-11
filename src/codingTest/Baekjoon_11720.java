package codingTest;

import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        int numSize = sc.nextInt();
        long num = sc.nextLong();

        int[] numArray = new int[numSize];
        String cvtIntToStr = Long.toString(num);
        String[] numSplit = cvtIntToStr.split("");

        int sum = 0;
        for (int i = 0; i < numSize; i++) {
            numArray[i] = Integer.parseInt(numSplit[i]);
            sum += numArray[i];
        }


        System.out.println(sum);*/
        // 위 방식은 런타임 에러가 났다.

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String a = in.next();
        in.close();

        int sum = 0;

        for(int i = 0; i < N; i++) {
            sum += a.charAt(i)-'0';
        }
        System.out.print(sum);

        //따라서 이전에 풀었던 아스키 코드를 이용하여 문제를 풀어보았다.
    }
}
