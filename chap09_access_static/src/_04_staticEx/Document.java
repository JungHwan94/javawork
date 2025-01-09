package _04_staticEx;

public class Document {
	String name;
	static int count;
	
	Document() {
		System.out.println("제목없음" + ++count + ".txt가 생성됨");
	}
	Document(String name) {
		this.name = name;
		System.out.println("문서" + this.name + ".txt가 생성됨");
	}

}
