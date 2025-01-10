package _04_polyBuyerArrayList;

public class Computer extends Product{
	Computer() {
		super(150);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

/*
Computer c = new Computer();
System.out.println(c) -> toString() 호출 return 패키지이름.클래스이름@주소
*/