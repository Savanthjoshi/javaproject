package Basic;

public class globallocal {

	
	public globallocal() 
	{
		
	}
	static int a=10;
	

	public static void main(String[] args) 
	{
		globallocal.test(10.2);
        int a=56;
        System.out.println(a);



	}
	static void test(double d)
	{
		double c=a+d;
		System.out.println(c);
	}

}
