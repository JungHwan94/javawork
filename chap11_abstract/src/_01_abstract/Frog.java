package _01_abstract;
public class Frog extends Pet{
	public Frog() {
        super("개구리", "초록색", "케로로");
    }

    public Frog(String kind, String color, String feature) {
        super(kind, color, feature);
    }

    @Override
    public void sound() {
        System.out.println("개굴");
}
}