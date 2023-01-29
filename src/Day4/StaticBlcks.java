package Day4;

public class StaticBlcks {

	/*
	 * 
	 * Initialize the data members
	 * Load/execute somethg before main method
	 * 
	 * 
	 */
	static {
		System.out.println("Static block is invoked");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method is invoked");
	}
}
