package _02_ExecutionControl;

public class ThreadA extends Thread {
	boolean stop = false; // 스레드 종료시 사용
	boolean work = true; // yield 메소드 호출한 시점을 알기 위해
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업하기");
			} else {
				Thread.yield(); // 작업을 하지 않을때 다른 스레드에게 양보
			}
		}
		System.out.println("ThreadA 종료");
	}
	
	
	
}
