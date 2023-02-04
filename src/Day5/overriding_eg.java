package Day5;

class parent1{
	void marriageproposal(){
		System.out.println("XYZ");
	}
	
	void house() {
		System.out.println("Bunglow");
	}
}

class child1 extends parent1{
	void marriage_proposal() {
		System.out.println("ABC");
	}
}


public class overriding_eg {
	public static void main(String[] args) {
		
		child1 c = new child1();
		c.marriageproposal();
		
	}
}
