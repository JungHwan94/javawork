package _01_conditional;

public class T04_중첩_if {

	public static void main(String[] args) {
		/*
		    중첩if문
		    if(바깥 조건식) {
		    	if(안의 조건식) {
		    			안의 조건식이 참일때
		    	} else {
		    			안의 조건식이 거짓일때
		    	} else {
		    			바깥 조건식에 대한 else
		    	  if(다른 조건식) {
		    	  		다른 조건식이 참일때
		    	  } else {
		    	  		다른 조건식이 거짓일때
		    	  }
		    	}
		 */

		int num1 = 99;
		
		if(num1 > 100) { //100보다 큰 수
			if(num1 > 200) { //200보다 큰 수
				System.out.println("200보다 큰 숫자");
			} else { // 200보다 작고 100보다 큰 수
				System.out.println("200보다 작고 100보다 큰 수");
			}
		} else { // 100보다 작은 수(0, -1.. 등 포함)
			if(num1 > 0) { //100~1
				System.out.println("양수");
				if(num1 % 2 == 0) {
					System.out.println("짝수");
				} else {
					System.out.println("홀수");
				}
			} else if(num1 == 0) {
				System.out.println("0");
			} else {
				System.out.println("음수");
			}
		}
		
		System.out.println("-------------------------------");
		
		//코드를 간단하게 짜고 싶으면 이렇게
		int num2 = 101;

		String rel2 = (num2 > 200) ? "200보다 큽니다" :
		                (num2 > 100) ? "200보단 작고 100보다 큽니다" :
		                (num2 > 0) ? "양수입니다\n" + ((num2 % 2 == 0) ? "짝수입니다" : "홀수입니다") :
		                (num2 == 0) ? "0입니다" : "음수입니다";

		System.out.println(rel2);
		
	}

}
