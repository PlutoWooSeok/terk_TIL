package codingTest;

import java.util.Scanner;

public class Programers_CommonMultiple {
    public  static void main(String[] args){
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if( number % n == 0 && number % m == 0){
            answer = 1;
        }
        else{
            answer = 0;
        }

        System.out.println(answer);

    }
}
