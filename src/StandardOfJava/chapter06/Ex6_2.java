package StandardOfJava.chapter06;

public class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1 채널은 " + t1.channel + "입니다");
        System.out.println("t2 채널은 " + t2.channel + "입니다");

        t1.channel = 7;
        System.out.println("t1의 channel을 7로 변경하였습니다.");

        System.out.println("t1 채널은 " + t1.channel + "입니다");
        System.out.println("t2 채널은 " + t2.channel + "입니다");
    }
}
