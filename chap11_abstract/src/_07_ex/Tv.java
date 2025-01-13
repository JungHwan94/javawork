package _07_ex;

public class Tv implements Product{

	private boolean power = false;
	private int vol = 1;
	private int cha = 1;
	
	@Override
	public void power(boolean on) {
		power = on;
		System.out.println("TV 전원: " + (power ? "켜짐" : "꺼짐"));	
	}

	@Override
	public void vol(int change) {
		vol += change;
		System.out.println("TV 볼륨: " + vol);
	}

	public void cha(int updown) {
		cha += updown;
		System.out.println("TV 채널: " + cha);
	}

	@Override
	public void game(String newgame) {		
	}

	@Override
	public void search(String find) {
		System.out.println("TV에서 검색 중: " + find);
	    System.out.println(find + "와 관련된 결과를 TV 화면에 표시합니다.");
	}
}
