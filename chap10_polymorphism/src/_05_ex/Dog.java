package _05_ex;

public class Dog extends Pet{
	public Dog() {
        super("강아지", "흰색", "비숑");
    }

    public Dog(String kind, String color, String feature) {
        super(kind, color, feature);
    }

    @Override
    public void sound() {
        System.out.println("왕왕");
}
}