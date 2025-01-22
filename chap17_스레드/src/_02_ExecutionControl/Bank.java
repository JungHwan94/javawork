package _02_ExecutionControl;

public class Bank {
	private int balance = 10000;
	
	public int getBalance() {
		return balance;
	}
	public void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔액부족");
		} else {
			balance -= money;
		}
	}
}
