package chap02_casting02;

import java.util.Scanner;

public class Hello_000 {

	public static void main(String[] args) {
		/*1. 문자하나를 입력받아 그 문자의 유니코드를 출력하기
		 
		3.  int iNum1 = 10;
		    int iNum2 = 4;
		    float fNum = 3.0f;
		    double dNum = 2.5;
		    char ch = 'K'; 
		    
		     */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요: ");
		char abc = scan.next().charAt(0);
		
		System.out.printf("입력한 문자: %c\n", abc);
		System.out.printf("유니코드: $d\n", (int) abc);
		
		
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K'; 
	    //3.1  iNum1 / iNum2의 몫 출력
	    System.out.printf("%d\n", iNum1/iNum2 );
	    //3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
	    double result2 = iNum2 * dNum;
	    System.out.printf("%.2f\n", dNum);
	    //3.3  iNum1의 값이 10.0으로 출력되게 하기
	    System.out.printf("%.1f\n", (double) iNum1);
	    //3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
	    System.out.printf("%.2f\n", (double) iNum1/iNum2);
	    //3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
	    System.out.printf("%d\n", (int)(iNum1/fNum));
	    //3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
	    System.out.printf("%.13f\n", iNum1/fNum);
	    //3.7  ch변수의 유니코드 출력하기
	    System.out.printf("%d\n", (int) ch);
	    //3.8  ch변수에 1을 더해 L 이 출력되게 하시오
	    System.out.printf("%c\n", (char) (ch+1));
	    

		
		
	}

}
