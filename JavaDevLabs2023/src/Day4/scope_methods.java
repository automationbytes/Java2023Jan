package Day4;

public class scope_methods {
	int x = 1;
	
	void number() {
		int x = 5;
		System.out.println(x); 
	}
	
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		scope_methods s = new scope_methods();
		int x = 10;
		System.out.println(x);
	}
}
