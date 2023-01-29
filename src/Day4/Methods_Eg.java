package Day4;

public class Methods_Eg {
	
	//accessmodifier nonmodifier returntype methodname(parameters){
//}
	
	int sum(int a, int b){
		return a+b;
	}
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
	//	int a = 5;
	
		Methods_Eg m = new Methods_Eg();
		
		System.out.println(m.sum(5, 10) / 2);
		
		//System.out.println(m.add(5, 10)/2);
		m.add(5, 10);
	}
}
