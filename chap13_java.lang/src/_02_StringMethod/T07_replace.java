package _02_StringMethod;
// replace(기존문자, 바꿀문자): 기존문자를 바꿀문자로 바꾸기
// replaceAll(기존문자, 바꿀문자): 기존문자를 바꿀문자로 바꾸기(정규표현식 때)
// replaceFirst(기존문자, 바꿀문자): 
public class T07_replace {
	public static void main(String[] args) {
		String str = "java lets go java javascript";
		String reStr = str.replace("a", "왕");
		System.out.println(reStr);
		
		String str2 = "간장공장장은 강공장장이고 강공장장은 장공장장이다";
		System.out.println(str2.replace("장", "a"));
		System.out.println(str2.replaceAll("장", "a"));
		System.out.println(str2.replaceFirst("장", "d"));
	}

}
