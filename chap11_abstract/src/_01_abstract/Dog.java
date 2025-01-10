package _01_abstract;

public class Dog extends Pet{
	public Dog() {
        super("강아지", "흰색", "비숑");
    }

    public Dog(String kind, String color, String feature) {
        super(kind, color, feature);
    }

    /*
	// 추상메서드에 구현할 내용이 없다면 빈 껍데기라도 써야됨
	void sound() {  }
	*/
    @Override
    public void sound() {
        System.out.println("왕왕");
}
}