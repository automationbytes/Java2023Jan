package Day5;

public class try_catch_eg {
	public static void main(String[] args) {

		try {
			String a = "hello";
			System.out.println(a.length());
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Hello");
		
		
	}
}
