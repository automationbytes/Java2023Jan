package Day7;

public class AddNumbers {
	public static void main(String[] args) {
		int num = 1234;
		//int temp = num;
		int remainder = 0;
		int sum = 0;
		while(num > 0) {
			remainder = num % 10;//4 3 2 1
			sum = sum + remainder;// 4 + 3 + 2 +1 
			num = num / 10;
			
		}
		System.out.println(sum);
		
	}
}
