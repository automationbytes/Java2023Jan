package Day4;

public class WithoutStatic {

	int num = 0;
	
	WithoutStatic(){
		num++;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		WithoutStatic a = new WithoutStatic();//1
		WithoutStatic b = new WithoutStatic();//1
		WithoutStatic c = new WithoutStatic();//1
		
		//3 memory for num - 3 objects
	}
	
}
