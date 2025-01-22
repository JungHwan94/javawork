package _02_ExecutionControl;

public class T02_Yield {
	public static void main(String[] args) {
		ThreadA thA = new ThreadA();
		ThreadB thB = new ThreadB();
		
		thA.start();
		thB.start();
		// 0.5초후에는 ㅇㄴ
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		thA.work = false; // 0.5초후에는 A, B 번갈아가면서 작업
		System.out.println("----------------");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thA.work = true;
		thB.work = true;
		
		
	}
}
