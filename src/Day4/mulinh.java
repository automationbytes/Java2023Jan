package Day4;

class A{
	void msg() {
		System.out.println("Hello A");
	}
}

class B{
	void msg() {
		System.out.println("Hello B");
	}
}

class C extends A{
	
}


public class mulinh {
public static void main(String[] args) {
	C obj  = new C();
	obj.msg();
}
}
