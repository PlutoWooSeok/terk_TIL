package StandardOfJava.chapter06;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        Card c2 = new Card();

        c1.kind = "Heart";
        c1.number = 7;

        c2.kind = "space";
        c2.number = 4;

        System.out.println("c1의 카드는 " + c1.kind + c1.number+"이며, 크기는 " + "(" +  c1.width +"," + c1.height + ") 입니다.");
        System.out.println("c2의 카드는 " + c2.kind + c2.number+"이며, 크기는 " + "(" +  c2.width +"," + c2.height + ") 입니다.");

        c1.width = 50;
        c1.height = 80;

        System.out.println("카드의 크기 변경합니다.");
        System.out.println("c1의 카드는 " + c1.kind + c1.number+"이며, 크기는 " + "(" +  c1.width +"," + c1.height + ") 입니다.");
        System.out.println("c2의 카드는 " + c2.kind + c2.number+"이며, 크기는 " + "(" +  c2.width +"," + c2.height + ") 입니다.");

    }
}
class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
