package _03_bank;

public class Bank_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(500);
		bank.deposit(0);
		
		bank.withdraw(1000);
		bank.withdraw(200);
		bank.withdraw(0);
		
		System.out.println("통장 잔액은 " + bank.getTotal() + "원 입니다.");
	}
}
