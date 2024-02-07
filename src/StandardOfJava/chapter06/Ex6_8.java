package StandardOfJava.chapter06;

class Data3{
    int x;
}
public class Ex6_8 {
    public static void main(String[] args) {
        Data3 d1 = new Data3();
        d1.x = 10;

        Data3 d2 = copy(d1);

        System.out.println("d1.x = " + d1.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();

        tmp.x = d.x;

        return tmp;
    }

}
