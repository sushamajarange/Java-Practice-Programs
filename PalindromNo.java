package temp;

import java.util.Scanner;

public class PalindromNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r,sum=0,temp,num;    
		num = sc.nextInt();
		  
		temp=num;    
		while(num>0){    
			r=num%10;
		    sum=(sum*10)+r;    
		    num=num/10;    
		}    
		if(temp==sum)    
			System.out.println("Palindrome number ");    
		else    
			System.out.println("Not palindrome");    		
	}

}
