package codingTest;

import java.util.Scanner;

/*
자바의 Scanner에는 char형을 받아 올 수 없다.
따라서 위 문제를 진행하기 위해서는 String으로 입력을 받은 후 문자형으로 변환하는 과정이 필요하다.
 */

public class Baekjoon_11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char c = str.charAt(0); //위 문제에서는 아스키코드를 하나씩 입력하기 떄문에 0번째 인덱스만 char형으로 변환한다.

        //문자를 숫자로 변환
        int answer = (int) c;

        System.out.println(answer);
    }
}
