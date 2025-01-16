package _03_ex;

public class BookRun {
	public static void main(String[] args) {
		LibraryController library = new LibraryController
		(new Member("한정환", 25, "남"));
		
		library.info();
		library.insertBook();
		
		System.out.println("책 목록:");
		for (Book book : library.selectAll()) {
			System.out.println(book.toString());
		}
		
		String searchTitle = "채식주의자";
		Book find = library.searchBook(searchTitle);
		if (find != null) {
			System.out.println("\n검색된 책: ");
			System.out.println(find.toString());
		} else {
			System.out.println("그런 책은 없으세요");
		}
		
	}
}
