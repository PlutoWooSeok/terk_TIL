package StandardOfJava.chapter03;

public class Ex3_11 {
    public static void main(String[] args){
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000)/1000.0;
        System.out.println(shortPi);
        //위의 코드는 Math.round()를 이용한 반올림하기 이다.

        //추가적으로 Math.ceil()과 Math.floor()를 이용하여 올림과 내림을 공부함
        pi = 3.141592;
        shortPi = Math.ceil(pi * 1000)/1000.0;
        System.out.println(shortPi);

        pi = 3.141592;
        shortPi = Math.floor(pi * 1000)/1000.0;
        System.out.println(shortPi);
    }
}
