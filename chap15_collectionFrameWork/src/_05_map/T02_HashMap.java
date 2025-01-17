package _05_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T02_HashMap {
	public static void main(String[] args) {
		// 키 = ID, 값 = PW (3개를 hashMap 넣기)
		Map<String, String> map = new HashMap<>();
		map.put("hwanyboy", "h123");
		map.put("hjhwan94", "h321");
		map.put("vkdl94", "p123");
		// 사용자로부터 ID, PW 입력 받음
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 입력: ");
		String ID = scan.nextLine();
		if(map.containsKey(ID)) {
			System.out.println("비밀번호 입력: ");
			String PW = scan.nextLine();
			if(map.get(ID).equals(PW)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("없는 ID입니다.");
		}
		scan.close();
		// ID가 map에 있나 확인, 없으면 "없는 ID입니다."
		// ID 있으면 - PW확인 - PW일치 -> "로그인 성공"
		// PW 불일치 -> "비밀번호가 틀렸습니다."
		
		
		
		
	}
}
