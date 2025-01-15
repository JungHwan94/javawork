package _01_calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class T04_Date_SimpleDateFormat {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		/*
		   SimpleDateFormat 클래스: 날짜에 대한 포맷을 제공
		   yyyy/M/dd		<- M 대문자인 이유: m은 시간을 나타내서 Month만 대문자
		   yyyy: 년도 4자리, yy: 년도 2자리
		   MM: 월 2자리, M: 월 1자리
		   mm: 분 2자리, m: 분 1자리
		   dd: 일 2자리, d: 일 1자리
		*/
		SimpleDateFormat abc = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(abc.format(today));
		
		/*
		    hh: 시(12시간제 0~11), HH: 24시간제(0~23)
		    mm: 분
		    ss: 초
		 */
		SimpleDateFormat abc2 = new SimpleDateFormat("yyyy-MM--dd hh:mm:ss");
		System.out.println(abc2.format(today));
		
		// E: 요일
		SimpleDateFormat abc3 = new SimpleDateFormat("E요일");
		System.out.println(abc3.format(today));
		
		String num = "20250904";
		SimpleDateFormat abc4 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat abc5 = new SimpleDateFormat("yyyy-MM-dd");
		
		Date strNow;
		try {
			strNow = abc4.parse(num);
			System.out.println(abc5.format(strNow));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date d1 = new Date(2025, 5, 7);
		d1.setMonth(7);
		
		
		
		
	}
}
