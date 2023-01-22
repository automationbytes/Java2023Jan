package Day3;

import java.util.Arrays;

public class StringEg {
	public static void main(String[] args) {
		//literal way
		String a = "Hello";
		String b = "Hello";
		
		//new keyword way
		String c = new String("Hello");
		String d = new String("Hello");
		//this will check value and memory
		System.out.println(a == b);
		
		System.out.println(a == c);
		
		System.out.println(c == d);
		
		//equals - will check only the value
		
		System.out.println(c.equals(d));
		
		//equals ignore case
		System.out.println(c.equalsIgnoreCase("HELLO"));

		System.out.println(c.equals("HELLO"));
		

		//compareto
		String e = "abc";//97 98 99
		String f = "ade";//97 100 99
		
		System.out.println(f.compareTo(e));
		System.out.println(f.compareTo("ABC"));//65 66 67
		
		System.out.println(e.compareToIgnoreCase("ABC"));
		
		//concat
		System.out.println(e.concat(f));
		
		System.out.println(e+f);
		
		//Starts-wit
		String h = "Hello World 2023";
		System.out.println(h.startsWith("Hello"));
		
		//endswith
		System.out.println(h.endsWith("2020"));
		
		//contains
		System.out.println(h.contains("orld"));
		
		//length
		System.out.println(h.length());
		
		//index of
		String g = "elephant";//0-e 1-l 2-e.. 
		System.out.println(g.indexOf("e"));//0
		
		System.out.println(g.lastIndexOf("e"));//2
		//g.lastIndexOf("a")
		
		
		//charAt
		System.out.println(g.charAt(4));
		
		//replace
		System.out.println(g.replace("e", "E"));
		
		//split
		String i = "Java is one of the popular programming language";
		String[] arr = i.split(" ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[0]);
		
		String j = "Your transcation number is 77946447";
		String trannum = j.split(" ")[4];
		System.out.println(trannum);
		
		//trim
		String k = "   hello world     ";
		System.out.println(k.trim());
		
		//Strip - 11
		System.out.println(k.strip());
		
		//left strip
		System.out.println(k.stripLeading());
		
		//right strip
		System.out.println(k.stripTrailing());
		
		//isempty
		String p = " ";
		System.out.println(p.isEmpty());//string will 0 - true
		//isblank
		String q = " ";
		System.out.println(p.isBlank());
		
		
	}
}
