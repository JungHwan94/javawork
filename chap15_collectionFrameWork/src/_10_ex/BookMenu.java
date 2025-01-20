package _10_ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	@Override
    public String toString() {
        return "책 제목: " + title + ", 저자: " + author;
    }
}
public class BookMenu {
    private List<Book> books = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    // 1. 새 도서 추가 / add @
    public void add() {
    	System.out.println("도서 제목 입력: ");
    	String title = scan.nextLine();
    	System.out.println("저자 입력: ");
    	String author = scan.nextLine();
    	books.add(new Book(title, author));
    	System.out.println("새 도서 추가 완료");
    }
    // 2. 전체 도서 조회 / find @
    public void find() {
    	if(books.isEmpty()) {
    		System.out.println("등록된 도서가 없습니다.");
    	} else {
    		System.out.println("==전체 도서 목록==");
    		for(Book book : books) {
    			System.out.println(book);
    		}
    	}
    	
    }
  // 3. 도서 검색 / search @
    public void search() {
    	System.out.println("검색할 도서 제목 입력: ");
    	String title = scan.nextLine();
    	boolean found = false;
    	
    	for(Book book : books) {
    		if(book.getTitle().equalsIgnoreCase(title)) {
    			System.out.println("검색결과: " + book);
    			found = true;
    			break;
    		}
    	}
    	if (!found) {
    		System.out.println("검색하신 도서는 없습니다.");
    	}
    }
  // 4. 도서 삭제 / delete @
    public void delete() {
    	System.out.println("삭제할 도서 제목 입력: ");
    	String title = scan.nextLine();
    	Iterator<Book> iterator = books.iterator();
    	boolean deleted = false;
    	
    	while(iterator.hasNext()) {
    		if(iterator.next().getTitle().equalsIgnoreCase(title)) {
    			iterator.remove();
    			System.out.println("해당 도서가 삭제되었습니다.");
    			deleted = true;
    			break;
    		}
    	}
    	if(!deleted) {
    		System.out.println("없는 도서입니다.");
    	}
    }
  // 5. 도서명 오름차순 정렬 @
    public void ascending() {
    	books.sort(Comparator.comparing(Book::getTitle));
        System.out.println("오름차순으로 정렬되었습니다.\n");
    }
  // 0. 종료 @
    public void exit() {
    	System.out.println("프로그램 종료");
    	scan.close();
    	System.exit(0);
    }
    public void runMenu() {
        while (true) {
            System.out.println("=== 도서 관리 프로그램 ===");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 전체 도서 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서명 오름차순 정렬");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: "); 
            int num = scan.nextInt();
            scan.nextLine();
 
            switch (num) {
                case 1:
                    add();
                    break;
                case 2:
                    find();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    ascending();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.\n");
}
        }
    }
}

/*
 * BookMenu (api)

==메뉴==
//1. 새 도서 추가 / add
//2. 전체 도서 조회 / find
//3. 도서 검색 / search
//4. 도서 삭제 / delete
//5. 도서명 오름차순 정렬 
//0. 종료
*/
