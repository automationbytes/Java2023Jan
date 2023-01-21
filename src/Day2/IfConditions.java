package Day2;

public class IfConditions {
public static void main(String[] args) {
	/*
	 * if(condition == true){
	 * block
	 *  }
	 * else{
	 * block -> condition is false
	 * }
	 */
	
	int a = 5;
	int b = 10;
	
	if(a > b) {
		System.out.println("A is greater than B");
	}else {
		System.out.println("B is greater than A");
	}
	
	/*
	 * 
	 * if(condition1){
	 * 
	 * }else if(condition 2){
	 * 
	 * }else{
	 * }
	 * 
	 * 	 * 
	 */
	
	
	int num = 0;
	if(num < 0) {
		System.out.println("Negative number");
	}else if(num > 0) {
		System.out.println("Positive number");	
	}else {
		System.out.println("Number is zero");
	}
	
	

	
	//smallest number
	int x = 5;
	int y = 3;
	int z = 11;
	
	if(x < y && x < z) {
		System.out.println("x is smallest number");
	}
	else if(y < z && y < x) {
		System.out.println("Y is smallest number");
	}
	else if(z < x && z < y) {
		System.out.println("Z is smallest number");
	}else {
		System.out.println("2 or more numbers are equal");
	}
	
}
}
