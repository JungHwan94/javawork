package _02_polyBuyer;

public class Product_main {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new GameDevice());
		System.out.println("현재 남은돈: " + b.money + "만원");
		System.out.println("현재 포인트: " + b.bonusPoint + "점");
		
		b.buy(new Tv());
	}

}
