package _02_car;

public class Ambulance extends Car{
	Ambulance(String model, String company){
		super(model, company); // super:부모의 생성자 호출
	}
	
	boolean siren;
	void siren() {
		if(siren = !siren) {
			System.out.println("삐용삐용");
		} else {
			System.out.println("stop");
		}
	}
	void firstAid() {
		System.out.println("응급처치");
	}

}
