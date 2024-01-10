package codingTest;


import java.util.Arrays;

public class Programers_MaxAndmin {
    public  static void main(String[] args){
        String s = "1 2 3 4";
        String[] numbers = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int number = Integer.parseInt(numbers[i]);

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        String answer = min+ " " +max;
        System.out.println(answer);
    }
}
