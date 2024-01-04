package StandardOfJava.chapter03;

public class Ex3_8 {
    public static void main(String[] args){
        byte a = 10;
        byte b = 30;
        byte c = (byte)(a*b);
        /*
        byte c = a*b;
        변수 c에 위와 같이 저장할 경우 컴파일 에러 발생
        a,b 모두 int 형보다 작은 byte형이기 떄문에  연산자 '*'는 이 두개의 피연산자들의 자료형을 int형으로 변환한 다음 연산을 수행
        따라서 int(4byte) -> byte(1byte)의 변수에 형변환없이 저장하려 했기 때문에 에러가 발생
         */
        System.out.println(c);
    }
}
