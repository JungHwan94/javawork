package _07_ex;

public class Product_main {

	public static void main(String[] args) {
		Tv tv = new Tv();
        tv.power(true);
        tv.vol(5);
        tv.cha(2);
        tv.search("날씨");
        tv.ai("오늘의 운세");

        Game game = new Game();
        game.game("카트라이더");
        game.power(true);
        game.vol(-3);
        game.power(false);
        
	}
}
