package project_00;

import java.util.Scanner;

public class P_1231 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
		/*
		System.out.println("정수 입력: ");
		int num1 = scan.nextInt();
		String rel = num1 > 0 ? "양수" : "노양수";
		System.out.println(rel + "입니다.");
		*/
		
		//2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
		/*
		System.out.println("정수 입력: ");
		int num2 = scan.nextInt();
		String rel2 = num2 > 0 ? "양수" :
					  num2 < 0 ? "음수" : "0";
		System.out.println(rel2 + "입니다.");
		*/
		
		
		//3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
		/*
		System.out.println("정수 입력: ");
		int num3 = scan.nextInt();
		String rel3 = (num3 % 2==0) ? "짝수" : "홀수";
		System.out.println(rel3 + "입니다.");
		*/
		
		
		/*4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
		   사용자로부터 인원수와 사탕의 갯수를 입력받아
		   1인당 동일하게 나눠가진 사탕 개수와
		   나눠주고 남은 사탕 갯수를 출력하기*/
		/*
		System.out.println("사탕의 갯수 입력: ");
		int candy = scan.nextInt();
		System.out.println("인원수 입력: ");
		int person = scan.nextInt();
		
		int candy2 = (person > 0) ? candy / person : 0; // 1인당 사탕 개수
        int candy3 = (person > 0) ? candy % person : candy; // 남은 사탕 개수
            
        String rel4 = (person > 0) 
                ? "1인당 사탕 개수: " + candy2 + "\n남은 사탕 개수: " + candy3
                : "인원수는 0보다 커야 합니다. 올바른 값을 입력해주세요.";

            System.out.println(rel4);*/
		
		
		/*5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
				이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.
				
				ex.
				이름 : 이준기
				학년(숫자만) : 2
				반(숫자만) : 7
				번호(숫자만) : 3
				성별(M/F) : M
				성적(소수점 둘째 짜리까지) : 97.35
				
				2학년 7반 3번 이준기 남학생의 성적은 97.35이다.*/
		/*
		System.out.println("이름: ");
		String name = scan.next();
		System.out.println("학년(숫자만): ");
		double grade = scan.nextDouble();
		System.out.println("반(숫자만): ");
		double ban = scan.nextDouble();
		System.out.println("번호(숫자만)");
		double num = scan.nextDouble();
		System.out.println("성별(남/여): ");
		String gender = scan.next();
		System.out.println("성적(소수점 둘째 자리까지): ");
		double score = scan.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.");
		//System.out.println(grade + "학년 " + ban + "반 " + num + "번 " + name + gender + "학생의 성적은 " + score + "이다.");
		*/
		

		/*6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
		    14세~19세 이하이면 청소년
		    20세 이상이면 성인으로 출력하시오*/
		/*
		System.out.println("나이 입력: ");
		int age = scan.nextInt();
		String rel6 = age <= 13 ? "어린이" :
					  age < 20 ? "청소년" : "성인";
		System.out.println(rel6 + "입니다.");
		*/

		/*7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.*/
		/*
		System.out.println("국어, 영어, 수학 점수 입력: ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		double avg = (kor + eng + mat)/3.0;
		
		String rel7 = (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) ? "합격" : "불합격";
		System.out.println(rel7 + "입니다.");
		*/

		/*8. 주민번호를 입력받아 남자인지 여자인지 출력하기
				
				ex.
				주민번호를 입력하세요(- 포함) : 123456-3123456*/
		/*
		System.out.println("주민번호 입력(ex:123456-3123456): ");
		String num8 = scan.nextLine();
		
		boolean regnum = num8.length() == 14 && num8.charAt(6) == '-';
        char gender = num8.charAt(7);
            
        String rel8 = regnum && (gender == '1' || gender == '3') ? "남자" :
                      regnum && (gender == '2' || gender == '4') ? "여자" : "유효하지 않은 주민번호입니다.";
		System.out.println(rel8);
		*/

		/*9.  사용자로부터 두 개를 입력 받고(num1, num2에 저장)
		    또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		    아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함)*/
               /*
                System.out.println("두 수를 입력: ");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                System.out.println("또 다른 하나의 정수 입력: ");
                int num3 = scan.nextInt();
                
                boolean co = num1 < num2;
                boolean rel9 = co && (num3 <= num1 || num3 > num2);
                System.out.println(rel9);
                */
                

		/*10. 사용자로부터 3개의 수를 키보드로 입력 받아 
		    입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
		    */
		/*
                System.out.println("수 3개 입력: ");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                int num3 = scan.nextInt();
                String rel10 = (num1 == num2 && num2 == num3) ? "true" : "false";
                System.out.println(rel10);
                */
                

	}
	
}
