package _01_conditional;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		/*
		    if(조건식){
		    	조건식이 참일때 실행할 구문
		    	} else {
		    		조건식이 거짓일때 실행할 구분
		    		}
		 */
		
		int score = 65;
		if(score >= 70) {
			System.out.println("축하합니다.");
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
			System.out.println("재시험입니당~ㅋㅋ");
		}
		System.out.println("------------------------------");
		
		int num1 = -100; //양수인지 음수인지 출력
		if(num1 >= 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		System.out.println("------------------------------");
		
		//사용자로부터 정수를 입력받아 짝수, 홀수 구분
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num2 = scan.nextInt();
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}

}
