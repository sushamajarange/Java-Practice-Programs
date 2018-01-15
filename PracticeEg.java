package temp;
class A{
	public void tempMth(){
		System.out.println("Temp method");
	}
}
public class PracticeEg extends A {
 
	public int tempMeth(int l){
		super.tempMth();
		return 0;
		//System.out.println("Temp method in public class");
	}
	int j;
	public void print(){
		int i=9;
		System.out.println(i);
	}
	public int print(int i){
		return 0;
		//System.out.println(i);
	}
	public void print(boolean b){
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeEg o = new PracticeEg();
		//PracticeEg 02=new A();
		A a= new PracticeEg();
		a.tempMth();
		o.print();
		o.tempMeth(12);
	
	}

}
