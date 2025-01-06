package _01_object;

public class T02_main2 {

	public static void main(String[] args) {
		T01_api_class t1 = new T01_api_class();
		System.out.println(t1.num);
		System.out.println(t1.name);
		
		t1.name = "홍길동";
		System.out.println(t1.name);
		
		T01_api_class t2 = new T01_api_class();
		System.out.println(t2.name);
		
		T01_api2 api2 = new T01_api2();
		System.out.println(api2.name);

	}

}
