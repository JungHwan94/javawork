package _08_comparable;

import java.util.Arrays;
import java.util.Comparator;

// Comparable 인터페이스의 compareTo()가 오버라이딩 되어있는 상태에서 사용
class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			// return c1.compareTo(c2) * -1;
			return c2.compareTo(c1);
		}
		return 0;
	}

}
public class T02_Comparator {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);		// String의 Comparable구현에 의해 정렬(대문자가 앞에)
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 x
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}