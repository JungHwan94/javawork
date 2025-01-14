package _07_ex;
/*
 * interface 다형성
   - interface는 객체 생성 안됨
   - interface를 상속받은 클래스를 객체생성하여 그 객체를 interface타입으로 형변환
   
 */
public class Product_main {

	public static void main(String[] args) {		
		// Product product = new Product();  객체생성 안됨
		
		Product product = new Game();	// 형변환 가능
		System.out.print(product + "의 ");
		product.power(false);
		System.out.println();
		
		System.out.println("---------------------------");
		
		product = new Tv();
		System.out.print(product + "의 ");
		product.power(false);
		System.out.println();
        
	}
}
