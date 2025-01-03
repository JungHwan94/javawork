package _03_ex;

import java.util.Scanner;

public class T02_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*
1.  주사위의 숫자 맞추기 게임
    랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
    사용자로 부터 숫자 입력받아서
    숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
    못맞췄으면 계속 물어보기


java책 p111 ~ 113까지 문제 풀기
*/
		/*
		int ran = (int)(Math.random() * 6);
		while(true) {
		System.out.println("숫자 입력: ");
		int num = sc.nextInt();
		
		if(num == ran) {
			System.out.println("축하합니다. 맞췄습니다");
			break;
		} 		
	}
		*/
		/* 5-1
		int sum = 0;
		int i = 1;
		int j = 5;
		for(i =1, j=5; i*j<=100; i++, j++) {
			System.out.println(i * j);
			sum += i*j;
			
		}
		System.out.println("5의 배수의 합계는 " +sum);
		*/
		/* 5-2
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=1; i<=100; i++) {
			if (i % 2==0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
			
		}
		System.out.println("짝수의 합계는 "+evenSum);
		System.out.println("홀수의 합계는 "+oddSum);
		*/
		
		/* 5-3
		for (int x=1; x<=6; x++) {
			for (int y=1; y<=6; y++) {
				if (x + y == 6) {
					System.out.println("("+ x + "," + y + ")");
				}
			}
		}
		*/
		/* 5-4
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		*/
		/* 5-5
		for (int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		*/
		/* 5-6
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= i * 2 - 1; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		*/
		
		int count = 0;
		int ran;
		
		while(true) {
		ran = (int)(Math.random() * 6)+1;
		count++;
		System.out.println("("+ ran + ")");
		
		if(ran == 6) {
			
			
			break;
		}
		}
		System.out.println("총 주사위 굴린 횟수는: "+ count + "회");
		}
		

}