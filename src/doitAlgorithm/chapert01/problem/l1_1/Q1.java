package doitAlgorithm.chapert01.problem.l1_1;
//네 값의 최댓값을 구하는 max4 메서드를 작성
public class Q1 {
    static int max4(int a, int b, int c, int d){
        int max = a;

        if (b>max) max = b;
        if (c>max) max = c;
        if (d>max) max = d;

        return max;
    }

    public static void main(String[] args){
        System.out.println("max4(1,2,3,4) = " + max4(1,2,3,4));
        System.out.println("max4(4,3,3,4) = " + max4(4,3,3,4));
        System.out.println("max4(5,3,1,4) = " + max4(5,3,1,4));
        System.out.println("max4(4,4,2,4) = " + max4(4,4,2,4));
    }
}
