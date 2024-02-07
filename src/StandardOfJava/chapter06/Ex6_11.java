package StandardOfJava.chapter06;

class Data_1 {
    int value;
}
class Data_2 {
    int value;

    Data_2(int x) {
        value = x;
    }
}
public class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
//        Data_2 d2 = new Data_2();  -> Data_2에 이미 생성자Data_2(int x)가 정의되어 있어 기본 생성자가 추가 되지 않기 때문에
//                                      compile error가  발생한다.
    }
}
