package StandardOfJava.chapter06;


import java.util.Arrays;

class MyMath {
    long a, b;

    //인스턴스변수 a, b만을 이용해서 작업하므로, 매개변수가 필요없다
    long add() { return a + b; }
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide(){ return  a / b; }

    //인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) {
        return a + b;
    }
    static long subtract(long a, long b) {
        return a - b;
    }
    static long multiply(long a, long b) {
        return a * b;
    }
    static double divide(long a, long b){
        return  a / b;
    }


}
public class Ex6_9 {
    public static void main(String[] args) {
        //클래스메서드 호출, 인스턴스 생성없이 호출가능
        System.out.println(MyMath.add(200L, 100L));
        System.out.println(MyMath.subtract(200L, 100L));
        System.out.println(MyMath.multiply(200L, 100L));
        System.out.println(MyMath.divide(200L, 100L));

        MyMath mm = new MyMath();   //인스턴스 생성
        mm.a = 200L;
        mm.b = 100L;

        //인스턴스메서드는 객체생성 후에만 호출 가능
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}
