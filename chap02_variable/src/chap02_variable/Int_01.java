package chap02_variable;

public class Int_01 {

	public static void main(String[] args) {
		/* 변수 : 저장공간
		 * 
		 * int : 정수를 저장하는 공간 = (4byte = 32bit)
		 * double : 실수를 저장하는 공간
		 * char : 문자1개
		 * String : 문자열
		 */
		// 컴퓨터 언어는 2진수로 되어 있음 (0, 1)
		// 1bit : 1개(0 or 1)
		// 1byte : 8bit
		
		/*
		 * 자료형 변수형;
		 * 변수명 값; 
		 */
		
		int num;
		num = 3;
		
		System.out.println(num);
		
		num = 4;
		System.out.println(num);
		
		int num2 = 5;
		System.out.println(num2);
		
		int sum = num + num2;
		System.out.println(num + "+" + num2 + "=" + num+num2);
		System.out.println(num + "+" + num2 + "=" + sum);
		
		// 새로운 저장공간 만들기(기존에 있던 저장공간과 동일이름 불가능)
		// int number2 = 10;
		
		/*1. int 저장공간을 2개 만들기
         2. 각각 5와 3을 넣기
         3. 저장공간의 각 값들을 4칙연산하여 출력하기
		 * dfdf
		 * */
			int num11;
			int num22;

			num11 = 5;
			num22 = 3;

			System.out.println("덧셈: " + (num11+num22));
			System.out.println("뺄셈: " + (num11-num22));
			System.out.println("곱셈: " + (num11*num22));
			System.out.println("나누기: " + (num11/num22));
		 


	}

}
