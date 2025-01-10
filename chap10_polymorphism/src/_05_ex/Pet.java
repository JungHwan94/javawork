/*api :
   Pet
     속성 : kind
            	color
	feature  // 지랄견
     생성자 : Pet(kind, color, feature) { }
     메소드 :
	sound()
	info() {출력문}    종류 : 비글, 색상 : 흰색
	// getter메소드
 	getKind() 
	getColor()	
	getFeature()
	// 오버라이딩
	toString() {return  }   종류 : 비글, 색상 : 흰색, 특징 : 지랄견

   Cat (Pet상속)
        // 생성자 2개
        Cat() { 매개변수3개인 생성자에 값 넘겨주기}
        Cat(kind, color, feature) { }
        // 오버라이딩
        sound()
   Dog (Pet상속)
   Frog (Pet상속)

main :     PetRun
  Pet pet1 = new Cat()
  Pet pet2 = new Cog()*/

package _05_ex;
public class Pet {
	String kind;
	String color;
	String feature;
	
	public Pet(String kind, String color, String feature) {
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	public void getKind(String kind) {
		this.kind = kind;
	}
	public void getColor(String color) {
		this.color = color;
	}
	public void getFeature(String feature) {
		this.feature = feature;
	}
	@Override
    public String toString() {
        return "종류: " + kind + ", 색상: " + color + ", 특징: " + feature;
    }
    public void sound() {
        System.out.println("Pet의 소리");
    }
}	

