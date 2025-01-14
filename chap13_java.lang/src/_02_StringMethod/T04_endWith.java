package _02_StringMethod;
// starWith(String): 문자로 시작하는지 boolean 변환
// endWith(String): 문자로 끝나는지 boolean 변환
public class T04_endWith {
	public static void main(String[] args) {
		String str = "김치 피자 탕수육";
		boolean flag = str.startsWith("김");
		System.out.println(flag);
		System.out.println(str.startsWith("김"));
		
		if(str.startsWith("김")) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		//endWith
		String str2 = "img.png";
		if(str2.endsWith("png") || str2.endsWith("jpg")){
			System.out.println("PNG");
		} else {
			System.out.println("NO PNG");
		}
		
		
	}
}
