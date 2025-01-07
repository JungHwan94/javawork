package _03_ex;

public class Phone_main {

	public static void main(String[] args) {
		Phone phone = new Phone("아이폰6", "화이트");
        SmartPhone smartPhone = new SmartPhone("갤럭시 S23", "블랙");
        
        System.out.println("아이폰:");
        phone.bell();
        phone.hangUp();
        phone.sendVoice("안녕하세요!");
        phone.receiveVoice("네, 안녕하세요!");
        phone.hangOut();
        System.out.println("----------------------------");
        
        System.out.println("갤럭시:");
        smartPhone.bell();
        smartPhone.hangUp();
        smartPhone.sendVoice("안녕하세요, 스마트폰!");
        smartPhone.receiveVoice("스마트폰으로 전화 받았어요!");
        smartPhone.hangOut();
        System.out.println("----------------------------");
        String result = smartPhone.search("날씨");
        System.out.println(result);
    }
}
