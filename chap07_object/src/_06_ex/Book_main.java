package _06_ex;

public class Book_main {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("브라이언 트레이서", 11397);
		Book book3 = new Book("유선경", 11717, 23800);
		Book book4 = new Book("클레어키건", 11306, 13800);
		
        System.out.println("채식주의자: ");
        System.out.println(book1.writer);
        System.out.println(book1.isbn);
        System.out.println(book1.price + "원");
        System.out.println("-----------------------");
        System.out.println("행동하지 않으면 인생은 바뀌지 않는다: ");
        System.out.println(book2.writer);
        System.out.println(book2.isbn);
        System.out.println(book2.price + "원");
        System.out.println("-----------------------");
        System.out.println("하루 한 장 나의 어휘력을 위한 필사 노트: ");
        System.out.println(book3.writer);
        System.out.println(book3.isbn);
        System.out.println(book3.price + "원");
        System.out.println("-----------------------");
        System.out.println("이처럼 사소한 것들: ");
        System.out.println(book4.writer);
        System.out.println(book4.isbn);
        System.out.println(book4.price + "원");
		
	}
}
