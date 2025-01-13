package _07_ex;

public interface Product {
	void power(boolean on);
    void vol(int change);
    void game(String newgame);
    
    default void ai(String chat) {
    	System.out.println("AI: " + chat + "에 대한 답변을 준비중...");
    }
    default void search(String find) {
    	System.out.println("검색결과: " + find + "는 못찾겠어용");
    }
}

