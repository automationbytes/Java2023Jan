package Day4;

public class Constructors_EG {

	/*
	 * class name and constructor name should be the same
	 * should nt hav any return type
	 * constructors cannot have non access modifiers  (Static, final, abstract and sync)	 * 
	 * 
	 * 1) Default constructors
	 * 2) Parameterized constructors
	 * 
	 */
	
	int num;
	String name;
	
//	Constructors_EG(){
//		System.out.println("Constructor is initiatied");
//	}
//	
//	Constructors_EG(int num, String name){
//		this.num = num;
//		this.name = name;
//	}
	
	public Constructors_EG(int num, String name) {
		//super();
		this.num = num;
		this.name = name;
	}	
	
	
	public static void main(String[] args) {
		
		Constructors_EG c = new Constructors_EG(10, "Sachin");
		Constructors_EG c1 = new Constructors_EG(18, "Virat");
		
		
		System.out.println(c.num);
		System.out.println(c.name);
		
		System.out.println(c1.num);
		System.out.println(c1.name);
		
	}



	
}
