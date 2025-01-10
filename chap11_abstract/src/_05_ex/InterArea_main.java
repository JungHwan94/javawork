package _05_ex;

public class InterArea_main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 4);
		System.out.println("직사각형 넓이: " + rectangle.area());
		
		Triangle triangle = new Triangle(7, 5);
		System.out.println("삼각형 넓이: " + triangle.area());
		
		
	}
}
