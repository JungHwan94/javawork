package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		/* 논리곱(and)과 논리합(or)
		   x y  논리곱(&&) 논리합(||)
		   0 0		0		0
		   0 1		0		1
		   1 0		0		1
		   1 1		1		1
		   
		   
		 */
		
		int num1 = 10;
		int num2 = 20;
		boolean result = num1==num2 && num2>1;
		
		System.out.println(result);
		
		result = num1==num2 || num2>num1;
		System.out.println(result);
		System.out.println("-----------------");
		
		boolean b1 = num1 >= num2;
		System.out.println(b1);
		System.out.println(!b1);
		System.out.println(!!b1);
		

	}

}
