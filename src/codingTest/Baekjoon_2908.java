package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1152 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();

        int answer = 0;
        input = input.trim();
        if (input.equals("")){
            System.out.println(answer);
        }
        else {
            String[] result = input.split(" ");
            System.out.println(result.length);
        }
    }
}


/*해당 문제는 3차시도 만에 맞췄다. 틀렸던 이유는 split() 매소드를 사용할 때 문자열의 앞뒤 공백이 있을 수 있다는 예외사항을 고려하지 못했으며,
* 이후 앞뒤 공백은 제거하였으나, ex) String str = ""; 의 경우 문자열의 길이는 1로 표현된다는 점을 고려하지 못하여 2차 시도 또한 실패하였다.
* 최종 3차 시도로는 모든 예외 사항을 정리 후 진행 => 결과적으론 성공했다.
*/