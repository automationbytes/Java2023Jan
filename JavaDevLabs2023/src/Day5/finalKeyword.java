package Day5;



public class finalKeyword {

	//variable
	final String schoolname = "Automation Bytes";
	
	
	final void collegename() {
		String colname = "Devlabs";
	}
	
	public static void main(String[] args) {
		finalKeyword f = new finalKeyword();
		//f.schoolname = "Hello";
		System.out.println(f.schoolname);
	}
	
}
