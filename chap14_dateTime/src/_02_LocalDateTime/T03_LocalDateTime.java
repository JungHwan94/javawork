package _02_LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class T03_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime day1 = LocalDateTime.of(2025, 6, 23, 15, 34, 26);
		System.out.println(day1);
		
		LocalDateTime startDay = LocalDateTime.of(2024, 12, 30, 10, 0, 0);
		LocalDateTime finalDay = LocalDateTime.of(2025, 7, 21, 15, 32, 2);
		
		DateTimeFormatter abc = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		System.out.println("시작일: " + abc.format(startDay));
		System.out.println("종료일: " + abc.format(finalDay));
		
		if(today.isBefore(finalDay)) {
			System.out.println("수업중");
		} else if(today.isAfter(finalDay)) {
			System.out.println("종료된 수업");
		} else if(today.isEqual(finalDay)) {
			System.out.println("오늘은 수업 종료날");
		}
		
	}
}
