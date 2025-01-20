package _06_tree;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T02_treeSet {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet();
		Scanner scan = new Scanner(System.in);
		// 5천원 넣으면 5번 돌아감 / 만원 10번
		System.out.println("복권 1000, 5000, 10000원권 중 하나 선택(숫자만 입력): ");
		int money = scan.nextInt();
		
		if(money == 1000) {
			while(set.size() < 6) {
				set.add((int)(Math.random()*45)+1);
			}
			System.out.println(set);
		} else if(money == 5000) {
			for(int i=0; i<5; i++) {
				Set<Integer> set1 = new TreeSet<>();
				while(set1.size() < 6) {
					set1.add((int)(Math.random()*45)+1);
			}
			System.out.println(set1);
		} 
		}else if(money == 10000) {
			for(int i=0; i<10; i++) {
				Set<Integer> set2 = new TreeSet<>();
				while(set2.size() < 6) {
					set2.add((int)(Math.random()*45)+1);
			}
			System.out.println(set2);
		} 
		}else {
			System.out.println("금액이 올바르지 않습니다.");
		}
		scan.close();
		}
	}


