package doitAlgorithm.chapert01.ex.l1_1;

import java.util.Scanner;

//3개의 정수값을 입력 후 중앙 값을 구해 출력
public class Median {
    static int ned3(int a, int b, int c){
        if(a>=b){
            if (b>=c)
                return b;
            else if (a<=c)
                return a;
            else
                return c;
        } else if (a>c)
            return a;
        else if(b>c)
            return c;
        else
            return b;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a의 값 :"); int a = stdIn.nextInt();
        System.out.print("b의 값 :"); int b = stdIn.nextInt();
        System.out.print("c의 값 :"); int c = stdIn.nextInt();

        System.out.println("중앙값은 " + ned3(a,b,c) + "입니다.");
    }
}
