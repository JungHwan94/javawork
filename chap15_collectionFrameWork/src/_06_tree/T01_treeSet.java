package _06_tree;

import java.util.TreeSet;

public class T01_treeSet {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		int score = scores.first();
		System.out.println("꼴등: " + scores.first());
		System.out.println("1등: " + scores.last());
		
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위 점수: " + scores.higher(95));
		System.out.println("95점과 같거나 아래 점수: " + scores.floor(95));
		System.out.println("95점과 같거나 위에 점수: " + scores.ceiling(81));
		System.out.println("총 객체 수: " + scores.size());
		
		
	}
}
