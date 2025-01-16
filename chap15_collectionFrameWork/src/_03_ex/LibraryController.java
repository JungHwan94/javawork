package _03_ex;

import java.util.ArrayList;

public class LibraryController {
		private Member member;
		private ArrayList<Book> aList;

		LibraryController(Member member) {
		this.member = member;
		aList = new ArrayList<>();
		}
		
		void info() {
			System.out.println(member.toString());
		}
		void insertBook() {
			aList.add(new Book("채식주의자", "한강", "창비"));
			aList.add(new Book("행동하지 않으면 인생은 바뀌지 않는다", "브라이언 트레이서", "현대지성"));
			aList.add(new Book("이처럼 사소한 것들", "클레어키건", "다산책방"));
		}
		ArrayList<Book> selectAll() {
			return aList;
		}
		Book searchBook(String bookTitle) {
			Book book = null;
			for(Book b : aList) {
				if (b.getTitle().equals(bookTitle)) {
					book = b;
					break;
				}
			}
			return book;
		}
	}
