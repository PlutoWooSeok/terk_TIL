package doitAlgorithm.chapert01.problem.l2;

import java.util.Scanner;

public class Q9 {
    static int sumOd(int a, int b){
        int sum = 0;
        int high = 0;
        int low = 0;

        if (a>b){
            high = a;
            low = b;
        }
        else {
            high = b;
            low = a;
        }

        for(int i = low ; i <= high ; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sumOd(a,b));
    }
}
