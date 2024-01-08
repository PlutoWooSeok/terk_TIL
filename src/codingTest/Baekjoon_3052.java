package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] remainArr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            remainArr[i] = arr[i]%42;
        }

        remainArr = Arrays.stream(remainArr).distinct().toArray();
        int result = remainArr.length;
        System.out.println(result);


    }
}
