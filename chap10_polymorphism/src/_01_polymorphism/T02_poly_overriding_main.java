package _01_polymorphism;
class Parent {
	void method1() {
		System.out.println("parent method1()");
	}
	void method2() {
		System.out.println("parent method2()");
	}
}
class Child extends Parent {
	// 어노테이션 @Override: 부모에게 똑같이 메소드가 있는지 알려줌
	@Override
	void method2() {
		System.out.println("child method2()");
	}
	void method3() {
		System.out.println("child method3()");
	}
}


public class T02_poly_overriding_main {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		// parent.method3(); @override 사용해서 사용불가, 오류뜸
		
		// 부모로 형변환시 오버라이딩 한것은 무조건 자식에게 있는 메소드 호출
		parent.method2();

	}
}
