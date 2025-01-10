package _03_polyBuyerArray;

public class Buyer {
	int money = 500;
	int bonusPoint;
	Product[] cart = new Product[10];
	int index = 0;
	/* 제품의 갯수만큼 오버로딩을 해야함
	void buy(Computer com) {
		
	}
	void buy(Tv tv) {
		
	}
	void buy(GameDevice gd) {
		
	} */
	//형변환을 하면 모든 제품을 다 받을수 있다
	void buy(Product p) { // b.buy(new Tv()) -> cart[0] = p
											//	cart[1] = p
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[index++] = p;
		System.out.println(p + "를 구입함");
	}
	
	void getInfo() {
		int sum = 0;		
		// String list = ""; //밑에 프린트 있어서 필요 x
//		Tv, Computer, GameDevice,
		System.out.print("구입한 물품 목록: ");
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null)
				break;
			// sum += cart[0].price;
			sum += cart[1].price;
			System.out.println(cart[i] + ", ");
		}
		System.out.println();
		System.out.println("구입한 물품의 합계: " + sum + "만원입니다.");
	}
}
