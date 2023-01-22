package Day3;

import java.util.Arrays;

public class Arrays_Ex {
	public static void main(String[] args) {

		//Sorting an array in ascending order
		int arr[] = {7,4,1,5,9,8,6,3};
		int temp = 0;
		for(int i = 0; i< arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) { // if(arr[i] < arr[j]) { // descending order
					temp = arr[i];//7
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		
		}
		System.out.println(Arrays.toString(arr));
		
		//find second highest number // arr[arr.length-n]
		System.out.println(arr[arr.length-2]);
		
		//smallest element //arr[n-1]
		System.out.println(arr[2-1]);
		System.out.println("******************");
		
		//duplicates value from an array		
		int arr1[] = {1, 3, 4, 5, 6, 3,4,2,1};

		for(int i = 0; i< arr1.length;i++) {
			for(int j = i+1;j<arr1.length;j++) {
				if(arr1[i] == arr1[j]) {
					System.out.println(arr1[j]);
				}
			}
		}
		
		
		System.out.println("====================");
		//reversing an array
		int arr2[] = {7,4,1,5,9,8,6,3};
		for(int i = arr2.length-1; i>=0;i--) {
			System.out.println(arr2[i]);
		}
		
		//sum of array
		//mul of array
		//copy of array
		int a[] = {7,4,1,5,9,8,6,3};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}



