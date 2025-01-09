package pra_00;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {
	}
	
	public Book(String title, String author, int price, String publisher){
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
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
	public void setPrice(int title) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	
	public String getSum() {
		return "제목:" + title + "\n작가:" + author + "\n가격:" + price + "원\n출판사:" + publisher;
	}
}
