package temp;

public class Swap {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Before swap = A is "+a +"  B is "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap = A is "+a +"  B is "+b);
		
	}

}
