package temp;

public class PrintEvenOddNo1TO100 {

	public static void main(String[] args) {
		int i;
		System.out.print("Even numbers :  ");
		for(i=0;i<=99;i++){
			while(i%2==0)
			{
				System.out.print(i+"  ");
				if(i<=99)
					break;
			}
		}
		System.out.println();
		System.out.print("Odd numbers : ");
		for(i=0;i<=99;i++){
			while(i%2!=0)
			{
				System.out.print(i+"  ");
				if(i<=99)
					break;
			}
		}
	}

}
