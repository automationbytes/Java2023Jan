package Day6;

import java.util.ArrayList;
import java.util.Collections;

public class Generics_Eg {
	public static void main(String[] args) {

		
		ArrayList<String> al = new ArrayList<String>();
		al.add("onion");
		al.add("carrot");
		al.add("tomato");
		al.add("potato");
		
		System.out.println(al);
		
		//sorting in ascending
		Collections.sort(al);
		System.out.println(al);
		
		//reversing
		
		Collections.reverse(al);
		System.out.println(al);
		
		
		//decending
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
	}
}
