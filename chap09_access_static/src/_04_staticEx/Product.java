/*
    고유한 제품번호
    제품의 갯수(객체가 생성된 갯수)
    
    Product p1 = new Product(); // 고유한 제품번호(더조은1)
    Product p2 = new Product(); // 고유한 제품번호(더조은2)
    Product p3 = new Product(); // 고유한 제품번호(더조은3)
    출력문: 생상된 총 제품의 갯수: 3
 */
package _04_staticEx;
public class Product {
	String name;
	static int count;
	
	Product() {
		//System.out.println("고유한 제품번호 (더조은" + ++count + ")");
		System.out.printf("고유한 제품번호 (더조은%d)\n", ++count);
	}
	public static int getCount() {
        return count;
    }
}
