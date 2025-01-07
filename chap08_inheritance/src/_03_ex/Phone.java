package _03_ex;

public class Phone {
	/*
	    속성: model, color
	    생성자(model, color)
	    void bell() //벨소리
	    void hangUp() //전화
	    void sendVoice(message) //보내다
	    void receveVoice(message) //받다
	    void hangOut() //전화
	    
	    SmartPhone extends Phone
	    -오류는 알아서 해결
	    String search(search)*/
	String model;
    String color;
    
    Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }
    void bell() {
        System.out.println("벨소리: 링링링...");
    }
    void hangUp() {
        System.out.println("전화 거는중...");
    }
    void sendVoice(String message) {
        System.out.println("나: " + message);
    }
    void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }
    void hangOut() {
        System.out.println("전화끊김");
    }
}
	class SmartPhone extends Phone {
		SmartPhone(String model, String color) {
        super(model, color);
    }
    String search(String query) {
        return "검색 결과: " + query + "에 대한 정보를 찾았습니다.";
    }
}