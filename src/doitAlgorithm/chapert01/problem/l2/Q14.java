package doitAlgorithm.chapert01.problem.l2;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수 : ");

        int no = sc.nextInt();

        for (int i = 0; i < no; i++) {
            for (int j = 0; j <no; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
