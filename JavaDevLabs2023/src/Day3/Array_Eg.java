package Day3;

import java.util.Arrays;

public class Array_Eg {
public static void main(String[] args) {
	
	/*'
	 * datatype[] name;
	 * datatype name[];
	 * 
	 */
	//1st way
	int[] myarr = new int[5];
	//int myarr1[] = new int[5];//array is declared
	
	myarr[0] = 5;
	myarr[1] = 2;
	myarr[2] = 4;
	myarr[3] = 7;
	myarr[4] = 5;
	
	System.out.println(myarr);
	//2way - while declaring we can initialize the value
	
	int arr[] = {5,2,4,7,5};
	
	//length of an array
	System.out.println(myarr.length);
	

	
	//to print the values
	//normal for loop
	for (int i = 0; i < myarr.length; i++) {
		System.out.println(myarr[i]);
	}
	System.out.println("-----------------");
	
	//for each loop
	for(int a : arr) {
		System.out.println(a);
	}

	//arrays
	System.out.println(Arrays.toString(arr));
	
	arr[1] = 9;
	System.out.println(Arrays.toString(arr));

	arr[5] = 15;
	System.out.println(Arrays.toString(arr));
}
}
