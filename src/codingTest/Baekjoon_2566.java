package codingTest;

import java.util.Scanner;

public class Baekjoon_2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nineToNineMatrix[][] = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                nineToNineMatrix[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < nineToNineMatrix[i][j]) {
                    max = nineToNineMatrix[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxI + 1) + " " + (maxJ + 1));
    }
}
