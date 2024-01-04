package StandardOfJava.chapter03;

public class Ex3_14 {
    public static void main(String[] args){
        String str1 = new String("abc");
        String str2 = "abc";
        //원래 String은 클래스이므로 위와 같이 new를 사용해서 객체를 생성해야 하나 특별히 String만 new를 사용하지 않고, 위와 같이 간단히 사용가능하다.

        System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" =="abc");
        System.out.printf("str1==\"abc\" ? %b%n", str1 =="abc");
        System.out.printf("str2==\"abc\" ? %b%n", str2 =="abc");
        System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf("str1.equals(\"ABC\") ? %b%n", str1.equals("ABC"));
        System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));

    }
}
