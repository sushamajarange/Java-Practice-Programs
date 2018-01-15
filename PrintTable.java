package temp;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int tab, j;
		for(j=1;j<=10;j++){
			tab = j*i;
			System.out.print(tab +"  ");
		}

	}

}
