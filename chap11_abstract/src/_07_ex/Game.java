package _07_ex;

public class Game implements Product{
	
	private boolean power = false;
	private int vol = 1;
	private String game = "게임";

	@Override
	public void power(boolean on) {
		power = on;
		System.out.println("게임 전원: " + (power ? "켜짐" : "꺼짐"));
	}

	@Override
	public void vol(int change) {
		vol += change;
		System.out.println("게임 볼륨: " + vol);
	}

	public void game(String newgame) {
		game = newgame;
		System.out.println(game + "로 변환합니다");
	}

	@Override
	public void search(String find) {		
	}
}
