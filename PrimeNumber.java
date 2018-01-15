package temp;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[]){ 
		
		int i,j=6,k=0;      
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();;//it is the number to be checked 
		
		j=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}
		else{  
			for(i=2;i<=j;i++){      
				if(n%i==0){      
				System.out.println(n+" is not prime number");      
				k=1;      
				break;      
		    }      
		 }      
		 if(k==0){
			 System.out.println(n+" is prime number"); 
		 }  
		 }
	}    
}
