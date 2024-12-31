package _01_conditional;

public class T01_if {

	public static void main(String[] args) {
		/*
		   조건문 : if문과 switch-case문
		   
		   if문 :
		   if(조건식) { 
		   			  조건식이 참일때 실행
		   			 }
		   -중괄호는 참일때 실행하는 구문이 1줄이면 생략가능
		   -참일때 실행하는 구문이 1줄 이상이면 반드시 중괄호를 넣어준다.
		   
		 */
		
		int num = 100;
		if(num == 100) { //이런식으로 한줄일땐 중괄호 생략가능 하지만 웬만해서 쓰는게 좋음
			System.out.println("100점입니다.");
		}
		
		if(num > 80) {
			System.out.println("축하합니다.");
			System.out.println("합격입니다.");
		}

	}

}
