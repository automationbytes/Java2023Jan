package Day5;

abstract class Parent{
	abstract void marriageproposal();
	
	void house() {
		System.out.println("Bunglow");
	}
}

class Child extends Parent{

	@Override
	void marriageproposal() {
		// TODO Auto-generated method stub
		System.out.println("overrided abstract method");
	}
	
}





public class Abstraction {

	public static void main(String[] args) {
		//Parent p = new Parent();
		Child c = new Child();
		c.marriageproposal();
		c.house();
	}
}
