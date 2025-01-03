package _02_2차원_Array;

public class T01_2Array {

	public static void main(String[] args) {
		//2차원 배열
		int [][] score = {
				{1,2,3,4,5}, //[0]행의 index번호
				{6,7,8}, //[1]
				{7,6,5,4}  //[2]
		};
		//열의 index번호 [0][1][2][3][4]
		System.out.println("score2의 행의 길이: " +score.length);
		System.out.println("socre2[0]의 열의 길이: "+score[0].length);
		System.out.println("socre2[0]의 열의 길이: "+score[1].length);
		System.out.println("socre2[0]의 열의 길이: "+score[2].length);
		
		int [][] score2 = {
				{1,2,3,4,5}, //[0]행의 index번호
				{6,7,8,9,10}, //[1]
				{7,6,5,4,3}};  //[2]
		System.out.println(score2[2][3]); //4
		System.out.println(score2[0][1]); //2
		
		
		
		for(int row=0; row<score2.length; row++) {
			for(int col=0; col<score2[0].length; col++) {
				System.out.println(score2[row][col]+ " ");
		}
		}
		
		//배열을 선언만 할때
		//int [][] score2 = new int[4][3];

	}

}
