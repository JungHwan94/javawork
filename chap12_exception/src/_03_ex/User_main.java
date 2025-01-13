package _03_ex;

import java.util.Scanner;

public class User_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("더할 정수 2개 입력: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        try {
            int result = add(num1, num2);
            System.out.println("두 수의 합: " + result);
        } catch (User e) { 
            System.out.println(e.getMessage());
        }
    }

    public static int add(int num1, int num2) throws User {
        if (num1 < 0 || num2 < 0) {
            throw new User("양수만 입력 가능합니다");
        }
        return num1 + num2;
    }
}
