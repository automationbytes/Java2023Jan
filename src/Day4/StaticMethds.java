package Day4;

public class StaticMethds {
/*
 * Static methods - Class methods
 * It belongs to class rather than objects (dont need objects to access clas methods)
 * Static method can access static variables
 * Non static variables cant be accessed in static method
 * This, super keyword also not used in static methds
 * 
 */
	
	int a = 10;
	static String name = "Hello";
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	static void greeting() {
		System.out.println(name);
		//System.out.println(this.a);
	}
	
	public static void main(String[] args) {
	
		System.out.println(sum(5,10));
		greeting();
	}
}
