package _04_Math;
// Math클래스: 수학에서 쓰는것을 메서드로 만들어 놓음
//			클래스안의 모든 필드와 메서드는 static이 붙어있음
public class T01_Math {
	public static void main(String[] args) {
		// 절대값: abs
		System.out.println("-15의 절대값: "+ Math.abs(-15));
		System.out.println("-15.6789의 절대값: "+Math.abs(-15.6789));
		
		// 소수점이하 무조건 올림: ceil()
		System.out.println("17.235의 올림: "+Math.ceil(17.235));
		System.out.println("-17.235의 올림: "+Math.ceil(-17.235));
		
		// 소수점이하 무조건 내림: floor()
		System.out.println("13.7의 올림: "+Math.floor(13.7));
		System.out.println("-13.7의 올림: "+Math.floor(-13.7));
		
		// 가장 가까운 정수로 변환: rint()
		System.out.println("13.1의 가까운 정수: "+Math.rint(13.1));
		System.out.println("13.7의 가까운 정수: "+Math.rint(13.7));
		System.out.println("13.5의 가까운 정수: "+Math.rint(13.5));
		System.out.println("-13.1의 가까운 정수: "+Math.rint(-13.1));
		
		// 솟줨 이하 반올림: round()
		System.out.println("13.1의 반올림: "+Math.round(13.1));
		System.out.println("13.8의 반올림: "+Math.round(13.8));
		System.out.println("-13.8의 반올림: "+Math.round(-13.8));
		
		// 소수점 2번째자리까지 얻기
		double value = 12.123124;
		double value2 = value * 100;
		System.out.println(value2);
		System.out.println(Math.round(value2) / 100.0);
		
		// 두 수 중에 큰수 or 작은수: max(), min()
		System.out.println("7, 5중에 큰수: "+Math.max(7, 5));
		System.out.println("7, 5중에 작은수: "+Math.min(7, 5));
		System.out.println((char)Math.max('a','z'));
		
		// 제곱연산: pow()
		System.out.println("5의 3승: "+(int)Math.pow(5, 3));
		System.out.println("1024의 3승: "+(int)Math.pow(1024, 3));
		
		// 제곱근: sqrt()
		System.out.println("25의 제곱근: "+(int)Math.sqrt(25));
		
	}
}
