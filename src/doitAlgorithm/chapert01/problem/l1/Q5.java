package doitAlgorithm.chapert01.problem.l1;

public class Q5 {
    static int med3_1(int a, int b, int c){
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

    static int med3_2(int a, int b, int c){
        if((b >= a && c <=a) || (b <= a && c >= a))
            return a;
        else if((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }

    //med3_1에 비해 med3_2 메서드는 효율이 떨어진다
    /*
     처음 if 문의 판단
　　  if ((b >= a && c<= a) || (b <= a && c >= a)에 주목합니다.

     여기서 b >= a 및 b <= a의 판단을 뒤집은 판단
    (실질적으로 동일한 판단)이, 계속하여  else 이후에서
　　
    else if ((a > b && c < b) || (b <= a && c > b)로 수행됩니다.
     즉, 처음 if가 성립하지 않는 경우,
     2번째 if에서도 (실질적으로 ) 같은 판단을 수행하므로,효율이 나빠집니다.
     */

    public static void main(String[] args) {
        System.out.println("med3_2(3,2,1) = " + med3_2(3,2,1));      // a＞b＞c
        System.out.println("med3_2(3,2,2) = " + med3_2(3,2,2));      // a＞b＝c
        System.out.println("med3_2(3,1,2) = " + med3_2(3,1,2));      // a＞c＞b
        System.out.println("med3_2(3,2,3) = " + med3_2(3,2,3));      // a＝c＞b
        System.out.println("med3_2(2,1,3) = " + med3_2(2,1,3));      // c＞a＞b
        System.out.println("med3_2(3,3,2) = " + med3_2(3,3,2));      // a＝b＞c
        System.out.println("med3_2(3,3,3) = " + med3_2(3,3,3));      // a＝b＝c
        System.out.println("med3_2(2,2,3) = " + med3_2(2,2,3));      // c＞a＝b
        System.out.println("med3_2(2,3,1) = " + med3_2(2,3,1));      // b＞a＞c
        System.out.println("med3_2(2,3,2) = " + med3_2(2,3,2));      // b＞a＝c
        System.out.println("med3_2(1,3,2) = " + med3_2(1,3,2));      // b＞c＞a
        System.out.println("med3_2(2,3,3) = " + med3_2(2,3,3));      // b＝c＞a
        System.out.println("med3_2(1,2,3) = " + med3_2(1,2,3));      // c＞b＞a
    }
}
