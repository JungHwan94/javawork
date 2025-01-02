package project_00;

import java.util.Scanner;

public class P_1231_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*1. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요. (if문으로)
		   */
		/*
		System.out.println("국어, 영어, 수학 점수 입력: ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		double avg = (kor + eng + mat)/3.0;
		
		if(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		*/

		/*2. id와 비밀번호를 변수에 저장하고
		   사용자로부터 아이디와 비밀번호를 입력 받아
		   아이디와 비밀번호가 모두 맞으면 "로그인 성공"출력
		   아이디가 틀렸으면 "아이디가 틀렸습니다"출력
		   비밀번호가 틀렸으면 "비밀번호가 틀렸습니다"출력*/
		/*
		String ID = "1234";
		String PASSWORD = "9876";
		
		System.out.println("아이디 입력: ");
		String id = scan.nextLine();
		System.out.println("비밀번호 입력: ");
		String pass = scan.nextLine();
		
		if(id.equals(ID) && pass.equals(PASSWORD)) {
			System.out.println("로그인 성공");
		} else if(!id.equals(ID) ){
			System.out.println("아이디가 틀렸습니다");
		} else if(!pass.equals(PASSWORD) ){
			System.out.println("아이디가 틀렸습니다");
		}
		*/

		/*3. 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 
		   계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.

			- BMI = 몸무게 / (키(m) * 키(m))

			BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
			BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
			BMI가 30이상일 경우 고도 비만*/
		/*
		System.out.println("키(ex: 1.75): ");
		double height = scan.nextDouble();
		System.out.println("몸무게: ");
		double weight = scan.nextDouble();
		double bmi = weight / (height * height);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if(bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else if(bmi >= 30) {
			System.out.println("고도비만");
		}
		*/

		/*4. 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력
		   평가 비율은 중간고사 20%, 
		                  기말고사 30%, 
		                  과제 30%, 
		                  출석 20%로 이루어져 있고 
		   이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산.
		   70점 이상일 경우 Pass, 
		   70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력

			ex) 1.
			중간고사 점수 : 80
			기말고사 점수 : 30
			과제 점수 : 70
			출석 회수 : 18
			============= 결과 ============
			중간 고사 점수(20) : 16.0
			기말 고사 점수(30) : 9.0
			과제 점수(30) : 18.0
			출석 점수(20) : 18.0
			총점 : 61.0
			Fail [점수 미달]

			ex) 2.
			중간고사 점수 : 80
			기말고사 점수 : 90
			과제 점수 : 50
			출석 회수 : 15
			============= 결과 ============
			중간 고사 점수(20) : 16.0
			기말 고사 점수(30) : 27.0
			과제 점수(30) : 15.0
			출석 점수(20) : 15.0
			총점 : 73.0
			Pass

			ex) 3.
			중간고사 점수 : 100
			기말고사 점수 : 80
			과제 점수 : 40
			출석 회수 : 10
			============= 결과 ============
			Fail [출석 횟수 부족(10/20)]
			
			*중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력
		   평가 비율은 중간고사 20%, 
		                  기말고사 30%, 
		                  과제 30%, 
		                  출석 20%로 이루어져 있고 
		   이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산.
		   70점 이상일 경우 Pass, 
		   70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력
			*/
		
		System.out.println("중간고사 점수 입력: ");
		double jong = scan.nextDouble();
		System.out.println("기말고사 점수 입력: ");
		double gi = scan.nextDouble();
		System.out.println("과제 점수 입력: ");
		double gua = scan.nextDouble();
		System.out.println("출석 횟수 입력: ");
		double chul = scan.nextDouble();
		
		double Sjong = jong * 0.2;
		double Sgi = gi * 0.3;
		double Sgua = gua * 0.3;
		double sum = Sjong + Sgi + Sgua + chul;
		System.out.println("중간고사 점수: " + jong);
		System.out.println("기말고사 점수: " + gi);
		System.out.println("과제 점수: " + gua);
		System.out.println("출석 점수: " + chul);
		System.out.println("==========결과==========");
		System.out.println("중간고사 점수(20): " + Sjong);
		System.out.println("기말고사 점수(30): " + Sgi);
		System.out.println("과제 점수(30): " + Sgua);
		System.out.println("출석 점수(30): " + chul);
		System.out.println("총점(30): " + sum);
		
		if(chul < 14) {
			System.out.println("Fail [출석 횟수 부족(" + chul +"/20]");
		} else if(sum < 70) {
			System.out.println("Fail [점수미달]");
		} else if(sum >= 70) {
			System.out.println("Pass");
		}
		
	}

}
