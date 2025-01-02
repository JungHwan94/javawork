package _01_string;

import java.util.Scanner;

public class T01_string {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1 == name2);
		
		String name3 = name1;
		System.out.println(name1 == name3);

		String name4 = new String ("홍길동");
		String name5 = new String ("홍길동");
		System.out.println(name4 == name5);
		System.out.println(name5.equals(name4));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소 입력(시 or 도만 입력): ");
		String city = sc.next();
		
		if(city.equals("경기도")) {
			System.out.println("경기도 사람");
		}
		System.out.println("종료");
	}

}
