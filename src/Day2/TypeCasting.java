package Day2;

public class TypeCasting {
public static void main(String[] args) {
	/*
	 * Typecasting - convert from one primitive datatype to another
	 * 
	 * Widening casting - smaller type to larger type
	 * (automatically)
	 * 
	 * 
	 * Narrowing casting - larger to smaller type
	 * (manually add the datatype)
	 * 
	 * 
	 */
	
	
	byte b = 50;
	int i = b;
	System.out.println(i);

	
	int i1 = 135;
	byte b1 = (byte) i1;//127, -128, -127, -126, -125 , -124, -123 , -122 , -121 ....
	System.out.println(b1);//-126
	
}
}
