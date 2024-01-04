package codingTest;

import java.util.Scanner;

public class Baekjoon_10813 {
    static int[] changeArr(int i, int j, int[] arr){
        int tmp = 0;
        tmp = arr[i-1];
        arr[i-1] = arr[j-1];
        arr[j-1] = tmp;
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];

        for(int i = 0; i<N ; i++){
            basket[i]= i+1;
        }

        for(int k = 0; k<M ; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            basket = changeArr(i,j,basket);
        }
        for (int i =0; i<N ; i++){
            System.out.print(basket[i]+" ");
        }


    }
}

