package doitAlgorithm.chapert01.problem.l1_2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 1 ; i<=n ; i++){
            sum += i;
        }
        System.out.print("1");
        for (int i = 2; i<=n ; i++){
            System.out.print(" + " + i);
        }
        System.out.println(" = " + sum);

        stdIn.close();
    }
}
