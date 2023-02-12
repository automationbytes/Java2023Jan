package Day2;

public class SwitchStatements {
	public static void main(String[] args) {

		
//		switch (expression) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		
//		int weekday = 3;
//		if (weekday == 1){
//			System.out.println("Monday");
//		}else if(weekday == 2) {
//			System.out.println("Tuesday");
//		}
		
		int weekday = 4;
		switch (weekday) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Provide values between 1-7");
			break;
		}
		
	}
}
