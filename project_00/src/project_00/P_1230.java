package project_00;

import java.util.Scanner;

public class P_1230 {
	
	public static void main(String[] args) {
	/*1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.

	   ex.
	   이름을 입력하세요 : 아무개
	   성별을 입력하세요(남/여) : 남
	   나이를 입력하세요 : 20
	   키를 입력하세요(cm) : 180.5

	   키 180.5cm인 20살 남자 아무개님 반갑습니다^^*/
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("이름: ");
	String name = scan.next();
	System.out.println("성별(남/여): ");
	String gender = scan.next();
	System.out.println("나이: ");
	double age = scan.nextDouble();
	System.out.println("키: ");
	int height = scan.nextInt();
	
	System.out.println("키 " + height + "cm인 " + age + "살 " + gender + "자 " + name + "님 반가워요 :)");
	

	/*2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

	   ex.
	   첫 번째 정수 : 23
	   두 번째 정수 : 7

	   더하기 결과 : 30
	   빼기 결과 : 16
	   곱하기 결과 : 161
	   나누기 몫 결과 : 3*/
	
	
	System.out.println("첫번째 정수 입력: ");
	int num1 = scan.nextInt();
	System.out.println("두번째 정수 입력: ");
	int num2 = scan.nextInt();
	
	System.out.println("더하기 결과: " + (num1 + num2));
	System.out.println("빼기 결과: " + (num1 - num2));
	System.out.println("곱하기 결과: " + (num1 * num2));
	System.out.println("나누기 몫 결과: " + (num1 / num2));
	

	/*3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	   계산 공식 ) 면적 : 가로 * 세로
		     둘레 : (가로 + 세로) * 2

	   ex.
	   가로 : 13.5
	   세로 : 41.7

	   면적 : 562.95
	   둘레 : 110.4*/
	
	
	System.out.println("가로 값 입력: ");
	double qu1 = scan.nextDouble();
	System.out.println("세로 값 입력: ");
	double qu2 = scan.nextDouble();
	
	System.out.println("면적: " + (qu1 * qu2));
	System.out.println("둘레: " + ((qu1 + qu2)*2));
	
	

	/*4. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.

	   ex.
	   문자열을 입력하세요 : apple

	   첫 번째 문자 : a
	   두 번째 문자 : p
	   세 번째 문자 : p*/
	
	System.out.println("문자열을 입력하세요: ");
	String eng = scan.next();
	
	System.out.println("첫 번째 문자: " + eng.charAt(0));
	System.out.println("두 번째 문자: " + eng.charAt(1));
	System.out.println("세 번째 문자: " + eng.charAt(2));
	
}
}
