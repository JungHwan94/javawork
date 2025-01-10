package _05_ex;

public class Triangle implements InterArea {
	double width;
	double height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return (width * height)/2;
	}

}


