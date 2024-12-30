package _01_operation;

public class T01_assignment {

	public static void main(String[] args) {
		int result = 10 % 3;
		System.out.println("10÷3의 나머지: " + result);
		
		//result = result + 1;
		result += 1;
		System.out.println(result);
		
		result *= 3;
		System.out.println(result);
		
		result -= 3;
		System.out.println(result);
		
		result /= 2;
		System.out.println(result);
		
		result = 7;
		result %= 5;
		System.out.println(result);
		
		int num2 = 30_000_000;// 숫자 단위가 클때 보기편하게 언더바 사용해도 무관
		System.out.println(num2);
		
	}

}
