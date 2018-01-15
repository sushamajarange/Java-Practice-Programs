package temp;
import java.util.Scanner;

public class FactorialEg {

	public static void main(String[] args) {
		int fact = 1, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num = sc.nextInt();
		
		while(num>=1){
			fact = fact * num;
			num -- ;
		}
		System.out.println("Factorial of entered number is : " + fact);
	}

}
