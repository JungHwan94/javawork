package project_00;

import java.util.Scanner;

public class P_0103 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num1 = new int[5];

        System.out.println("정수값 5개 입력:");
        for (int i = 0; i < num1.length; i++) {
            System.out.print((i + 1) + "번째 정수: ");
            num1[i] = scan.nextInt();
        }

        for (int i = 0; i < num1.length - 1; i++) {
            for (int j = 0; j < num1.length - 1 - i; j++) {
                if (num1[j] > num1[j + 1]) {
                    int temp = num1[j];
                    num1[j] = num1[j + 1];
                    num1[j + 1] = temp;
                }
            }
        }

        System.out.println("오름차순 정렬 결과:");
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + " ");
        }
    }
}
