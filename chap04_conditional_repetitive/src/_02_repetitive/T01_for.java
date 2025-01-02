package _02_repetitive;

public class T01_for {

	public static void main(String[] args) {
		/*
		    반복문 : 원하는 갯수(조건이 맞을때까지)만큼 반복하여 실행하고자 할때
		    1. for : 원하는 갯수만큼 반복 실행
		       for(조건식; 조건식; 증감식) {
		       		실행문
		       }
		    2. while : 조건이 맞을때까지 반복 실행
		    3. do~while
		 */
		
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("------------------------");
		
		for(int i=1; i<=10; i++) {
			System.out.println("이랏샤이마세");
		}
		System.out.println("------------------------");
		
		for(int i=1; i<=8; i++) {
			System.out.println("hello");
			System.out.println("Nice");
		}
		System.out.println("------------------------");
		for(int i=100; i>=1; i--) {
			System.out.println("OMG");
		}
		System.out.println("------------------------");
		for(int i=1; i<10; i+=2) { // i=i+2
			System.out.println(i + "번째");
		}
		System.out.println("------------------------");
		
		// 1~100까지의 합계 구하기
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println("합산값" +sum);
	}

}
