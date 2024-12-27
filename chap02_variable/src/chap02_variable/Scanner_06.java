package chap02_variable;

import java.util.Scanner;

public class Scanner_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int number1 = scan.nextInt();
		
		System.out.println("입력받은 값: " + number1);
		
		
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.println("이름: " + name);
		
		System.out.print("당신은 학생 입니까?(true, false): ");
		boolean student = scan.nextBoolean();
		System.out.println("당신의 답은: " + student);
		
		//실수형으로 있을때 nextDouble()
		//문자열의 한 문장을 얻어올 때 nextLine() : enter를 칠때까지
		scan.nextLine();
		
		//24줄의 enter가 들어올 nextLine()중간에 사용할 때는 한번 더 써져서 앞의 enter를 넣어줌
		//혹은 맨 첫줄에 넣을때는 상관없음
		System.out.print("주소 입력: ");
		
		String address = scan.nextLine();
		System.out.println("주소는: " + address);
		
		
		System.out.print("성의 이니셜 1글자 입력: ");
		char initial = scan.next().charAt(0);
		System.out.println("성의 이니셜은: " + initial);
		
		
		System.out.println("정수 3개 입력(띄어쓰기로) >> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		System.out.println("첫번째 숫자: " + num1);
		System.out.println("두번째 숫자: " + num2);
		System.out.println("세번째 숫자: " + num3);
		
		
		/*레포트
		 * 1. 사용자로부터 2수를 입력받아 사칙연산을 출력하시오.
		 * 2. 사용자로부터 연산자(1글자)를 입력받아 위 1번의 두 수를 연산하여 출력하시오
		 */
	}

}
