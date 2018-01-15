package temp;

import java.util.Scanner;

public class StringLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str.toLowerCase());
		
		
		String str1 = "SUshAMa";
		str1 = str1.toLowerCase();
		System.out.println(str1);
		System.out.println(str1.toUpperCase());

	}

}
