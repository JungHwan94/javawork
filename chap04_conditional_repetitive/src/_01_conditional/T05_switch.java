package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		    switch ~ case문
		    
		    switch(변수) {
		    	case 1 :
		    		변수에 들어있는 값이 1일때 실행;
		    		break; //만약 break가 없으면 참이여도 실행
		    	case 2 :
		    		변수에 들어있는 값이 2일때 실행;
		    		break;
		    	defalut :
		    		변수에 들어있는 값이 1, 2를 제외한 나머지 숫자일때;
		    }
		 */
		
		int num = 2;
		switch(num) {
			case 1:
				System.out.println("1입니다");
			case 2:
				System.out.println("2입니다");
			case 3:
				System.out.println("3입니다");
			default:
			System.out.println("1,2,3을 제외한 다른 숫자");
		}
		System.out.println("switch문을 빠져나옴");
		
		
		char ch = 'k';
		switch(ch) {
		case 'k':
			System.out.println("김씨입니다");
			break;
		case '1':
			System.out.println("이씨입니다");
			break;
		case 'p':
			System.out.println("박씨입니다");
			break;
			default:
				System.out.println("성이 김, 이, 박씨가 아닙니다");
		}
		
		
		System.out.println("태어난 달을 입력: ");
		int mon = scan.nextInt();
		
		switch(mon) {
		case 12:
		case 1:
		case 2:
			System.out.println("당신은 겨울에 태어났습니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("당신은 봄에 태어났습니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("당신은 여름에 태어났습니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("당신은 가을에 태어났습니다.");
			break;
		}
		
		
		
		
		// 연산할 두 숫자와 연산자(+,-,*,/,%)를 입력받아 연산한 결과 출력
		
		System.out.println("연산할 숫자 2개 입력: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("연산자 입력 (+, -, *, /, %): ");
        char op = scan.next().charAt(0);
		
		switch(op) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
			case '%':
				System.out.println(num1 % num2);
				break;
			default:
				System.out.println("다시 입력하세요");
		
		}
		}
		
		
}


