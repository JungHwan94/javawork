package _02_car;

public class Car {
	String model;
	String company;
	boolean power;
	int speed;
	
	Car(String model, String company) {
		this.model = model;
		this.company = company;
	}
	
	void power() {
		if(power = !power) {
			System.out.println("부릉부릉~");
		} else {
			System.out.println("off");
		}
	}
	
	int speedUp() {
		speed += 5;
		return speed;
	}
	int speedDown() {
		speed -= 5;
		return speed;
	}
}
