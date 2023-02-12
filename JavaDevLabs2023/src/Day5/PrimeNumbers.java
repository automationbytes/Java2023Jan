package Day5;

//check prime number or not
//first 10 primenummabers
//within 10 wat are prime numbers 


public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.println(1);
		int count= 0;
		for(int i = 2; i<100;i++) {
			boolean isprime = true;
			for(int j = 2; j<i; j++) {
				if(i %j == 0) {
					isprime = false;
					break;
				}
			}
		
		if(isprime) {
			System.out.println(i);
			count++;
		}
		if(count == 10) {
			break;
		}
		
		}
	}
}
