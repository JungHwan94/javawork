package chap02_variable;

import java.util.Scanner;

public class Report_08 {

	public static void main(String[] args) {
		// 사용자로부터 국어, 수학, 컴퓨터의 점수를 입력받아 총점과 평균(소수점 2째자리까지 반올림) 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어, 수학, 컴퓨터 점수 입력: ");
		int kor = scan.nextInt();
		int math = scan.nextInt();
		int com = scan.nextInt();
		
		int total = kor + math + com;
		double avg = total / 3;
		
		System.out.printf("총점: %d\n", total);
		System.out.printf("평균: %.2f\n", avg);
		
	}

}
