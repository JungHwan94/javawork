package _01_operation;

public class T02_increase {

	public static void main(String[] args) {
		// ++ : 하나 증가
		// -- : 하나 감소
		
		int num = 10;
		num++; //11
		num++; //12
		num--; //11
		num++; //12
		System.out.println(num);
		
		// 항이 2개일때 연산을 하면 앞이나 뒤에 붙는것이 따라 결과가 달라짐
		num = 10;
		int num2 = 10;
		
		//앞에 붙으면 증가를 먼저 시킨다
		int result = ++num + ++ num2;
		System.out.println(result);
		
		num = 10;
		num2 = 10;
		result = num++ + num2++;
		System.out.println(result);
		System.out.println("num= " + num + ", num2= " + num2);
		
		num = 10;
		num2 = 10;
		result = num-- + ++num2;
		System.out.println(result);
		
		num = 10;
		num2 = 10;
		result = --num + num2++;
		System.out.println(result);
		
	}

}