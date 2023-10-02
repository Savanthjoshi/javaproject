package Basic;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = new int[12];
	 int b=15;
	 for(int i=0; i <a.length; i++)
		 {
		 int c = ++b;
		 a[i] = c;
		 System.out.println("a["+i+"] =" +a[i]); 
		 }
		 }

}
