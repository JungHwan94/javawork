package chap01_print;

public class Print05 {

	public static void main(String[] args) {
		/* escape sequence
		 * 문자조합으로 특수 기능을 수행
		 * \n : 줄바꿈
		 * \t : 탭만큼 띄우기
		 * \" : 쌍따음표 표시
		 * \\ : 역슬레스(\) 표시
		 */
		System.out.print("더조은 학원\n수강중\n");
		System.out.print("801호\t수업중\n");
		System.out.print("그가 말했다 \"왜 그렇게 생기셨어요\" 그는 이상한 사람이다\n");
		System.out.print("java \\ omg");
	}

}
