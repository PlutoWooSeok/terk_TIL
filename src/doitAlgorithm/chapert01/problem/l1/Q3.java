package doitAlgorithm.chapert01.problem.l1;

public class Q3 {
    static int min4(int a, int b, int c, int d){
        int min = a;

        if (b>min) min = b;
        if (c>min) min = c;
        if (d>min) min = d;

        return min;
    }

    public static void main(String[] args){
        System.out.println("min4(1,2,3,4) = " + min4(1,2,3,4));
        System.out.println("min4(4,3,3,4) = " + min4(4,3,3,4));
        System.out.println("min4(5,3,1,4) = " + min4(5,3,1,4));
        System.out.println("min4(4,4,2,4) = " + min4(4,4,2,4));
    }
}
