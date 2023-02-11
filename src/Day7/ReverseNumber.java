package Day7;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 19591;
		int temp = num;
		int remainder = 0;
		int reversenum = 0;
		while(num > 0) {
			remainder = num % 10;//1 9
			reversenum = (reversenum * 10) + remainder;// 1 10+9
			num = num / 10;
			
		}
		
		System.out.println(reversenum);
		
		if(temp == reversenum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
