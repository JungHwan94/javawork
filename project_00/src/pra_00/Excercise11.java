package pra_00;

public class Excercise11 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 24, 13, 3, 21};

        Math m = new Math();
        int max = m.max(arr);
        int min = m.min(arr);

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}

class Math {
    // 코드 작성
	int max(int[]arr) {
		int max = arr[0];
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
	int min(int[]arr) {
		int min = arr[0];
		for(int num : arr) {
			if(num < min) {
				min = num;
			}
		}
		return min;
	}
	
}