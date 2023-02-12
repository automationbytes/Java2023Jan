package Day7;

public class LengthOfNum {
	public static void main(String[] args) {
		int num = 1234;
		//int temp = num;
		int remainder = 0;
		int counter = 0;
		while(num > 0) {
			num = num/10;
			counter++;
		}
		System.out.println(counter);
		
	}
}
