package doitAlgorithm.chapert01.ex.l1;

public class Max3m {
    static int max3(int a, int b, int c){
        int max = a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;

        return max;
    }

    public static void main(String[] args){
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(3,2,2) = " + max3(3,2,2));
        System.out.println("max3(3,1,2) = " + max3(3,1,2));
        System.out.println("max3(2,1,3) = " + max3(2,1,3));
        System.out.println("max3(3,3,1) = " + max3(3,3,1));
    }
}
