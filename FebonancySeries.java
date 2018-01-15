package temp;

public class FebonancySeries {

	public static void main(String[] args) {
		int i=0, j=1, k, l, count =10;
		System.out.print(i +" "+j+"   ");
		
		for(k=2;k<count;++k){
			l = i+j;
			System.out.print(l +"   ");
			i=j;
			j=l;
		}
	}

}
