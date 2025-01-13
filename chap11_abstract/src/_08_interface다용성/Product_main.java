package _08_interface다용성;
/*
    interface 다형성
    - interface를 상속받은 클래스를 객체생성하여 interface타입으로 형변환
 */
public class Product_main {

	public static void main(String[] args) {
		// interface는 객체 생성 안됨
		// Product product = new Product();
		
		Product product = new Game();
		System.out.println(product);
		product.power();
        
	}
}
