package _02_StringMethod;
// substring(fromIndex): fromIndex번호부터 ~ 끝까지 가져오기
// substring(fromIndex, endIndex): fromIndex번호부터 ~ endIndex번호까지 가져오기
public class T09_substring {
	public static void main(String[] args) {
		String str = "spring aws start";
		String result = str.substring(7);
		System.out.println(result);
		
		System.out.println(str.substring(7,10));
		
		String sn = "950904-3121234";
		String gender = sn.substring(7,8);
		System.out.println(sn.substring(2,4) + "월 "+sn.substring(4,6)+"일생 입니다.");
		System.out.println((25+1-Integer.parseInt(sn.substring(0,2)))+"살 입니다.");
		
		int age = Integer.parseInt(sn.substring(0,2));
		if(age < 25) {
			int age2 = age + 2000;
			int nowage = 2025 - age2 + 1;
			System.out.println(age2 + "년생은 " + nowage + "살 입니다.");
		} else {
			int age3 = age + 1900;
			int nowage2 = 2025 - age3 + 1;
			System.out.println(age3 + "년생은 " + nowage2 + "살 입니다.");
		}
		
		
		
		
		
		
		
//		if(gender.equals("1") || gender.equals("3")) {
//			System.out.println("남자");
//		} else {
//			System.out.println("여자");
//		}
		
//		switch(gender) {
//		case "1": case "3";
//			System.out.println("남자");
//		case "2": case "4";
//			System.out.println("여자");
//		}
		
//		if(gender==1 || gender==3) {
//			System.out.println("남자");
//		} else {
//			System.out.println("여자");
//		}
		

	}
}
