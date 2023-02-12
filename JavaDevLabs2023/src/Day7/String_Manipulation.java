package Day7;


public class String_Manipulation {
	public static void main(String[] args) {
		
		
		
		String str = "Hello123#Tom";
		System.out.println(str.replaceAll("[^0-9]", ""));
		
		System.out.println(str.replaceAll("[^A-Za-z]", ""));
		System.out.println(str.replaceAll("\\d",""));
		System.out.println(str.replaceAll("\\D", ""));
		
		char[] arr = str.toCharArray();
		for(char c : arr) {
			if(Character.isDigit(c)) {
				System.out.print(c);
			}
			//System.out.println(Character.is);
		}
		
	}
}
