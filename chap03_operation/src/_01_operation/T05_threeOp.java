package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		//삼항연산자
		//조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
/*
		int num1 = 10;
		int num2 = 7;
		
		String result = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		System.out.println(result);
		
		char rel = num1 < num2 ? '소' : '대';
		System.out.println("num2의 숫자는 num1의 숫자보다 " + rel);
		
		//num3의 값을 절대값으로 변경하기
		int num3 = -8;
		num3 = num3 < 0 ? -num3 : num3;
		System.out.println("절대값: " + num3);
		*/
		// 사용자로부터 점수를 입력받아 80점 이상이면 합격 그렇지 않으면 불합격을 출력
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("점수 입력: ");
		int score = scan.nextInt();
		String result2 = score >= 80 ? "합격" : "불합격";
		System.out.println(result2 + "입니다.");
		*/
		System.out.println("점수 입력: ");
		int score = scan.nextInt();
		
		String result3 =
				score >= 90 ? "A" :
				score >= 80 ? "B" :
				score >= 70 ? "C" :
				score >= 60 ? "D" : "F";
		System.out.println("이번 학기 학점은 " + result3 + " 입니다.");
		
	}

}
