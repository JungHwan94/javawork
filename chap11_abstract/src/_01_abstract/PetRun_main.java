package _01_abstract;

public class PetRun_main {
	public static void main(String[] args) {
		Pet pet1 = new Cat("고양이", "회색", "귀여움");
		Pet pet2 = new Dog("강아지", "흰색", "짱귀여움");
		Pet pet3 = new Frog("개구리", "초록색", "귀엽나..?");
			
		if (pet1 instanceof Cat) {
            Cat cat = (Cat) pet1;
            System.out.println("고양이 - " + cat);
        }
		if (pet2 instanceof Dog) {
            Dog dog = (Dog) pet2;
            System.out.println("강아지 - " + dog);
        }
		if (pet3 instanceof Frog) {
            Frog frog = (Frog) pet3;
            System.out.println("개구리 - " + frog);
        }
		pet1.sound();
		pet2.sound();
		pet3.sound();
	}
}