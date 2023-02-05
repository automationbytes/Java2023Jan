package Day6;

import java.util.ArrayList;

public class ArrayList_Eg {
	public static void main(String[] args) {

		ArrayList al = new ArrayList(); //10
		
		//shortcut for importing is ctrl+shift+o
		
		//add an element
		al.add(null);
		al.add(70);
		al.add(3.5);
		al.add("Hi");
		System.out.println(al);
		
		al.add(3,"Devlabs");
		System.out.println(al);
		
		
		ArrayList al1 = new ArrayList(); //10
		al1.add(5);
		al1.add(7);
		al1.add(15);
		al1.add(78);
		al1.add(95);
		al1.add(77);
		al1.add(51);
		al1.add(766);
		
		
		al.addAll(al1);
		System.out.println(al);
		
		
		//CLONE - copy same content to new
		
		ArrayList al2 = (ArrayList) al.clone();
		System.out.println(al2);
		
		
		//contains - to check whether its there or not
		System.out.println(al2.contains("Devlabs"));
		
		//get
		System.out.println(al.get(4));
		
		//set - updating
		al.set(4, "Moon");
		System.out.println(al);
		
		//remove
		al.remove(2); //index
		al.remove("Devlabs"); //value
		System.out.println(al);
		
		//indexof - reverse of get. it wll return the index for the mentioned value
		System.out.println(al.indexOf(15));
		
		
		
	}
}
