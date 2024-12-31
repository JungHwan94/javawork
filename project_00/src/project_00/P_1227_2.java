package project_00;

import java.util.Scanner;

public class P_1227_2 {

	public static void main(String[] args) {
		/*레포트
		 * 1. 사용자로부터 2수를 입력받아 사칙연산을 출력하시오.
		 * 2. 사용자로부터 연산자(1글자)를 입력받아 위 1번의 두 수를 연산하여 출력하시오
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 2개 입력: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		
		System.out.println("연산자를 입력하시오(+, -, *, /): ");
		char op = scan.next().charAt(0);
		if(op == '+')
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		if(op == '-')
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		if(op == '*')
			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		if(op == '/')
			System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		System.out.println(num1 + op + num2 + "=" + (num1+num2));

	}

}
