package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraystoArraylist {

	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Mango", "Pineapple", "Banana"};
		
		//method1 - not a recommended way
		List<String> list = Arrays.asList(fruits);
		System.out.println(list);
//		list.add("Stawberry");
//		System.out.println(list);
		
		//method2 - more preferred way
		List<String> list1 = new ArrayList();
		Collections.addAll(list1, fruits);
		System.out.println(list1);
		list1.add("Stawberry");
		System.out.println(list1);
		
		//method3
		List<String> list2 = new ArrayList();
		
		for(String f : fruits) {
			list2.add(f);
		}
		list2.add("blueberry");
		System.out.println(list2);
		list2.set(2,"jackfruit");
		System.out.println(list2);
		
	}
	
}
