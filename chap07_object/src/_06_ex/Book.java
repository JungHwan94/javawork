package _06_ex;

public class Book {
	/*
	    Book
	    속성: 저자(String)
	    	ISBN(int/숫자5개)
	    	가격(int)
	    생성자 4개 오버로딩
	    
	    
	    package _04_tv;
	
	 */
	String writer;
	int isbn;
	int price;
	
	public Book(){
		this("한강", 89364, 15000);
	}
	public Book(String writer){
		this(writer, 11397, 16900);
	}
	public Book(String writer, int isbn){
		this(writer, isbn, 23800);
	}
	public Book(String writer, int isbn, int price){
		this.writer = writer;
		this.isbn = isbn;
		this.price = price;
	}
	

}
