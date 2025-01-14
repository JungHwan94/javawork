package _02_StringMethod;

import java.util.Arrays;

// split(기준문자): 기준문자를 기준으로 문자열을 나누어서 배열로 반환
public class T08_split {
	public static void main(String[] args) {
		String names = "김민지-카리나-윈터-팜하니";
		String[] name = names.split("-");
		System.out.println(Arrays.toString(name));
//		for(String n : name) {
//			System.out.println(n);
//		}
		String names2 = "김민지-카리나-윈터-팜하니@유나";
		System.out.println(Arrays.toString(names2.split("-|/|,|@")));;
		
	}
}
