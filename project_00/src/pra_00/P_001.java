package pra_00;

public class P_001 {

	public static void main(String[] args) {
		/* 1~10의 정수 합산 값
		int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for(int i=0; i<num1.length; i++) {
			sum += num1[i];
		}
		System.out.println(sum);
		
		//임의 5개 정수 제일 큰 값 구하기
		int[] num2 = {23, 45, 12, 67, 34};
		int big = num2[0];
		for(int i=0; i<num2.length; i++) {
			if(num2[i] > big) {
				big = num2[i];
			}
		}
		System.out.println(big);
		
		//정수 값 평균 구하기
		int[] numbers = {10, 20, 30, 40, 50};
		int sum = 0;
		int avg = 0;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
			avg += sum /3;
		}
		System.out.println(avg);
		
		//정수값 짝수, 홀수 갯수 구하기
		int[] numbers2 = {15,22,37,48,53,60};
		int jjak = 0;
		int hol = 0;
		for(int i=0; i<numbers2.length; i++) {
			if(numbers2[i] % 2== 0) {
				jjak++;
			} else {
				hol++;
			}
		}
		System.out.println("짝수갯수: " +jjak);
		System.out.println("홀수갯수: " +hol);
		
		//정수 최대값, 최소값 구하기
		int[] numbers = {35, 22, 89, 56, 78};
		int dae =numbers[0];
		int so =numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]>dae) {
				dae = numbers[i];
			}
			if(numbers[i]<so) {
				so = numbers[i];
			}
		}
		System.out.println("최대값:" +dae);
		System.out.println("최소값:" +so);
		
		
		int[] numbers2 = {1, 2, 3, 4, 5};
		for (int i=numbers2.length -1; i>=0; i--) {
			System.out.print(numbers2[i]+"");
		}
*/    //배열 행, 열 갯수 구하기
		int[][] numbers = {
			    {12, 15, 18},
			    {23, 26, 29, 32},
			    {34, 37}
			};
		System.out.println("행의 갯수: "+numbers.length);
		System.out.println("열의 갯수: "+numbers[1].length);
		
		
		
	}

}
