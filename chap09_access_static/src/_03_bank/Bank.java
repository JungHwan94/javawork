/*
    private 잔액: 필드
    입금 메서드
    출금 메서드(잔액보다 많이 찾으면 안됨)
    getter메서드 잔액필드
    
    
    사용자는 deposit() 메서드로 입금.
    
	사용자는 withdraw() 메서드로 출금. (잔액보다 많은 금액 요청 시 처리)
	
	사용자는 getBalance() 메서드로 잔액 조회.
 */
package _03_bank;
public class Bank {
	
	private int total;
	
	void deposit(int money) {
		if(money > 0) {
			total += money;
			System.out.println(money + "원 입금 확인되었습니다.");
		} else {
			System.out.println("0원 이하는 입금 불가능입니다.");
		}
	}
	void withdraw(int money) {
		if(money > total) {
			System.out.println("통장의 잔액이 부족합니다.");
		} else if(money > 0) {
			total -= money;
			System.out.println(money + "원 출금 되었습니다.");
		} else {
			System.out.println("0원 이하는 출금 불가능입니다.");
		}
	}
	int getTotal() {
		return total;
    }
//	void getTotal() {   //이걸로 써도 가능
//		System.out.println("통장 잔액은 " + total + "원 입니다.");
//	}
}
