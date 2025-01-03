package _01_oneArray;

public class T03_ex01 {

	public static void main(String[] args) {
		// 1. 총점과 평균 출력
		double score[] = {100, 95, 90, 80, 70};
		
		double sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		double avg = sum / score.length;
		System.out.println("총점: " +sum);
		System.out.println("평균: " +avg);
		
		// 2. 최대값 최소값 구하기
		int num[] = {83, 70, 27, 49, 20, 86, 90, 83, 58, 29};
		
		int dae = num[0];
		int so = num[0];
		
		for(int i=0; i<num.length; i++) {
			if (num[i] > dae) {
				dae = num[i];
			}
		if (num[i] < so) {
			so = num[i];
		}
		}
		System.out.println("최대값: " +dae);
		System.out.println("최소값: " +so);

	}

}
