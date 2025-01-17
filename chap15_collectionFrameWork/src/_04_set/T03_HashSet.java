package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


// equals()를 오버라이딩 했을때 hashCode()를 반드시 오버라이딩 해야됨
class Member {
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return m.name.equals(name) && m.age==age;
		}
		return false;
	}
}
public class T03_HashSet {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		set.add(new Member("홍길동",20));
		
		System.out.println(set.size());
		Iterator<Member> iter = set.iterator();
		iterPrint(iter);
		
		
		
	}

	private static void iterPrint(Iterator<Member> iter) {
		// TODO Auto-generated method stub
		
	}
}
