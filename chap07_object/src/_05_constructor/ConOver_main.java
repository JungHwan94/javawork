package _05_constructor;

class ConOver2 {
	int num;
	double dou;
	String name;
	
	ConOver2() { //인스턴스 변수
		this(1, 1.0, "홍길동"); // 무조건 첫째줄에 넣어야함
	}
	
	ConOver2(int num) { //지역변수
		// this.num = num;  //this: 나 자신의 객체
		this(num, 1.0, "홍길동");
		System.out.println("매개변수가 2개인 생성자");
	}
	//생성자에서 다른 생성자를 호출할 수 있다.
	ConOver2(int num, double dou) {
		//다른 생성자를 호출할때는 첫번째에 넣어야됨
		this(num, dou, "홍길동");
	}
	ConOver2(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자");
	}
	//가변인자: 들어올 인자(매개변수에 넣어줄 값)의 갯수를 모를때
	// int(... num): 인자가 0개이상
	// * 반드시 들어와야할 인자가 인자가 있다면 먼저 선언하고 가변인자는 맨 마지막에 넣는다
	
	void method(int... num) {
		System.out.println("인자가 0개 이상");
	}
	void method2(int num, int...num2) {
		System.out.println("인자가 1개 이상");
		System.out.println("첫번째 값: " + num);
		for(int result : num2) {
			System.out.println(result);
		}
		System.out.println("---------------------");
	}
	void method3(String str, String... name) {
		System.out.println("고정 인자: " + str); // 고정 인자 출력

	    System.out.println("가변 인자:");
	    for (String n : name) { // 가변 인자 반복 출력
	        System.out.println(n);
	    }
	    System.out.println("---------------------");
}
}
public class ConOver_main {
	public static void main(String[] args) {
		ConOver2 con = new ConOver2(5);
		System.out.println(con.num);
		System.out.println(con.dou);
		System.out.println(con.name);
		con.method();
		con.method(2);
		con.method(3,7,6,8,9);
		
		con.method2(5);
		con.method2(4,8,9,5);
		
		con.method3("/","홍길동", "이순신", "강감찬");

	

}
}
