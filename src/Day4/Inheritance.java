package Day4;

class aAnimal{
	void eat() {
		System.out.println("Animal Eat Method");
	}
	
	void sleep() {
		System.out.println("Animal Sleep Method");
	}
}

class dDog extends aAnimal{
	void sound() {
		System.out.println("Dog says Bow Bow");
	}
}
//
//class Man{
//	void eat() {
//		System.out.println("Animal Eat Method");
//	}
//	
//	void sleep() {
//		System.out.println("Animal Sleep Method");
//	}
//}

public class Inheritance {
	public static void main(String[] args) {
	
		dDog d = new dDog();
		d.sound();
		d.eat();
		d.sleep();		
	}
}
