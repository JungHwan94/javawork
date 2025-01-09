package _01_polymorphism;

class A {int a=1;}
class B extends A {int b=2;}
class C extends A {int c=3;}
class D extends B {int d=4;}
class E extends C {int e=5;}

public class T01_poly_main {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		System.out.println(b.a);
		System.out.println(b.b);
		// 부모 A타입으로 형변환했기 때문에 a변수만 사용가능
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(a3.a);
		System.out.println(a4.a);
		//부모 B타입으로 형번환하면 B는 A를 상속받았기 때문에 변수 a, b 사용가능 
		B b1 = d;
		System.out.println(b1.a);
		System.out.println(b1.b);
	}
}
