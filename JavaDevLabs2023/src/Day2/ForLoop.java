package Day2;

public class ForLoop {
	public static void main(String[] args) {
/*
 * for(init;condition;increment/decrement){
	}
 * start; stop; step
 * 
 * 
 */
	for(int i = 1; i <= 10 ; i++) {
		System.out.println(i);
	}
		
	System.out.println("-----------------");
	
	for(int i = 10; i <= 100 ; i = i +10) {
		System.out.println(i);
	}
		
	System.out.println("-----------------");
	
	
	for(int i = 10; i >= 0; i--) {
		System.out.println(i);
	}
	
	System.out.println("-----------------");
	
	
	for(int i = 1; i <= 5 ; i++) {
		System.out.println("a");
		
		for(int j = 1; j <= 3 ; j++) {
			System.out.println(i);
		}
		
	}
	
	
	
	}
}
