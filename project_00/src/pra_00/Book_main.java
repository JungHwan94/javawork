package pra_00;

import java.util.Scanner;

import pra_00.Book;

public class Book_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book book1 = new Book("채식주의자", "한강", 15000, "창비");
		Book book2 = new Book("행동하지 않으면 인생은 바뀌지 않는다", "브라이언 트레이서", 16900, "현대지성");
		Book book3 = new Book("이처럼 사소한 것들", "클레어키건", 13800, "다산책방");
		
		System.out.println("검색할 도서의 제목 입력: ");
		String name = scan.nextLine();
		
		if(name.equals(book1.getTitle())) {
			System.out.println(book1.getSum());
		} else if(name.equals(book2.getTitle())) {
			System.out.println(book2.getSum());
		} else if(name.equals(book3.getTitle())) {
			System.out.println(book3.getSum());
		} else {
			System.out.println("책이 없습니다.");
		}
	}
}
