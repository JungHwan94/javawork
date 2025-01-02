package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		/*
		 *  while(조건식 {
		 *  	조건식이 참인동안 계속 실행
		 *  }
		 *  
		 *  반복문에서 같이 사용
		 *  - break : 반복문을 빠져 나올때
		 *  - continue : continue뒤의 구문은 실행하지 않고 다시 반복문 실행
		 *  
		 *  for문을 while로
		 *  출력 1 2 3 4 5
		 */
//		for(int i=1; i<=5; i++) {
//			System.out.println(i);
//		}
		
		int i = 1; //초기식
		while(i<=5) { //조건식
			System.out.println(i);
			i++; //증감식
		}
		System.out.println("----------------");
		
		// 1~10까지의 합계(while문으로)
		i =1;
		int sum = 0;
		while(i<=10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1~10까지의 합계" + sum);
		
		i =1;
		sum = 0;
		while (i<=10) {
			// sum = sum + ++i;
			sum += ++i; // 10까지 실행후 참이여서 다음 11을 돌려서 거짓이여서 거기서 종료
		}
		System.out.println("2~11까지의 합계" + sum);
		System.out.println("----------------");
		//break
		int count = 0;
		while(true) {
			System.out.println(++count);
			if(count == 5) {
				break;
			}
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("문자 1개(멈추려면 'Q') 입력: ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'Q') {
				break; // 반복문을 끝낸다
			}
			System.out.println(ch);
		}
		System.out.println("프로그램 종료");
		
		
		sum = 0;
		int j = 1;
		for(j=1; j<=10; j++) {
			sum += j;
			
			if(sum >= 30)
				break;
		}
		System.out.println(j + "까지의 합: " + sum);
		System.out.println("----------------");
		//continue
		// 1~100까지의 합계 중 3의 배수를 제외한 합계 구하기
		
		sum = 0;
		for (int x=1; x<=100; x++) {
			if (x%3 ==0) {
				continue;
			}
			sum += x;
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계: " + sum);
	}

}
