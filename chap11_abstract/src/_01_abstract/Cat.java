package _01_abstract;

public class Cat extends Pet{
	 public Cat() {
	        super("고양이", "회색", "먼치킨");
	    }

	    public Cat(String kind, String color, String feature) {
	        super(kind, color, feature);
	    }

	    @Override
	    public void sound() {
	        System.out.println("미아옹");
}
}
