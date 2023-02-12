package Day2;

public class LogicalOperators {
	public static void main(String[] args) {

		int a = 1;
		int b = 5;
		int c = 15;
		
		System.out.println(a<b && a>c);//true and false
		/*
		 * true and true = true
		 * true and false = false
		 * false and true = false
		 * false and false = false
		 * 
		 */
		
		System.out.println(a<b || a>c);//true or false
		/*
		 * true or true = true
		 * true or false = true
		 * false or true = true
		 * false or false = false
		 * 
		 */
		
		//not -> reversing the result
		System.out.println(a == b); //false
		System.out.println(!(a==b)); //true
		
		
		/*
		 * 
		 * 1) check eligibity for voting (18)
		 * 2) leap years
		 * 3) odd/even
		 * 
		 * 
		 * 
		 */
		
		
		
	}
}
