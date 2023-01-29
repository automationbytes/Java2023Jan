package Day4;

class calc{
	
	int square(int num) {
		return num*num;
	}
	
}

class circle{
	calc c; //agg
	double pi = 3.14;
	
	double area(int rad) {
		c = new calc();
		return pi * c.square(rad);
	}
}


public class Aggregation_Eg {
public static void main(String[] args) {
	circle cir = new circle();
	System.out.println(cir.area(10));//3.14*10*10
}
}
