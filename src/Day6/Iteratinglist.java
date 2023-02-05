package Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iteratinglist {
	public static void main(String[] args) {

		
		String[] fruits = {"Apple", "Mango", "Pineapple", "Banana"};
		List<String> list1 = new ArrayList();
		Collections.addAll(list1, fruits);
		
		for(Object l : list1) {
			System.out.println(l);
			
		}

		
		//iterator
		ListIterator ltr = list1.listIterator();
		while(ltr.hasNext()) {
//			if(ltr.next() == "Mango") {
//				ltr.remove();
//			}
			System.out.println(ltr.next());
		}
		
	}
}
