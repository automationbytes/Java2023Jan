package Day5;

public class throw_Eg {

	void positivenumbers(int num) throws Exception {
		if(num <= 0) {
			throw new Exception("Negative number");
		}
		else {
			System.out.println("Positive number");
		}
	}
	
	public static void main(String[] args) throws Exception {
		throw_Eg t = new throw_Eg();
		t.positivenumbers(-5);
	}
	
}
