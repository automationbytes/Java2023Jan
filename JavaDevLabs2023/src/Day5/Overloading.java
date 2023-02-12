package Day5;

public class Overloading {

	int sum(int a, int b) {
		return a+b;
	}
	
//	void sum(int a) {
//		System.out.println(a);
//		//return a;
//	}
//	
	int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	double sum(double a, double b) {
		return a+b;
	}
	
	//concatanation of two string
	String sum(String a, String b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		System.out.println(o.sum("hi", "2023"));
		System.out.println(o.sum(5, 20));
		System.out.println(o.sum(5.5, 20.5));
		
	}
}
