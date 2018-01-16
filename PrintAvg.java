package temp;

import java.util.Scanner;

public class PrintAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, sum;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = (a+b+c)/3;
		System.out.println(sum);
	}

}
