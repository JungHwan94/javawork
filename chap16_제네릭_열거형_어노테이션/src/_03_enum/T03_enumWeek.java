package _03_enum;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class T03_enumWeek {
	public static void main(String[] args) {
		Calendar day = Calendar.SUNDAY;
		
		LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
                                                 
        String koreanDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);
        
        System.out.println("오늘의 요일: " + koreanDay);
        
        if(day.equals(koreanDay)) {
        	System.out.println("일요일엔 짜파게티 먹는날");
        } else {
        	System.out.println("아주 열심히 자바 공부하는날");
        }
		
		
		
	}
}


//사용 요일 얻어오기
//
//if
//일요일엔 짜파게티 먹는날
//else
//아주 열심히 자바 공부하는날