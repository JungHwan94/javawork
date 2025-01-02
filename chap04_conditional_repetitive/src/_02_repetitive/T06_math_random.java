package _02_repetitive;

public class T06_math_random {

	public static void main(String[] args) {
		/*
		   Math(수학에 관련된 클래스)
		   random : 실수형으로 출력(0 ~ 0.9999...)
		*/
		
		double random1 = Math.random(); // 0~0.9999...
		System.out.println(random1);
		
		double random2 = Math.random() * 10; // 0~9.9999...
		System.out.println(random2);
		
		int random3 = (int)(Math.random() * 10); //0~9 정수만 출력
		System.out.println(random3);
		
		int random4 = (int)(Math.random() * 10) + 1; //0~10 정수만 출력
		System.out.println(random4);
		
		int random5 = (int)(Math.random() * 5); //0~4 정수만 출력
		System.out.println(random5);
		
		
	}

}
