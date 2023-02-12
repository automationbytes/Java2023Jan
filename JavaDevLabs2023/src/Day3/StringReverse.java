package Day3;

import java.util.Arrays;

public class StringReverse {
	public static void main(String[] args) {
		
		String str = "hello";
//		char[] arr = str.toCharArray();
//		System.out.println(Arrays.toString(arr));
//		for(int i= arr.length-1; i>=0;i--) {
//			System.out.print(arr[i]);
//		}
		
		for(int i = str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
//		
	}
}
