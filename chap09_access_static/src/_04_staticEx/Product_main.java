package _04_staticEx;

public class Product_main {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("생산된 총 제품의 갯수: " + Product.getCount());	
		
		Product p4 = new Product();
		Product p5 = new Product();
		
		System.out.println("생산된 총 제품의 갯수: " + Product.getCount());
	}
}
