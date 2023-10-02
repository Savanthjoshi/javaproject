package Basic;

public class methodoverloading
{

	public methodoverloading()
	{
		
	}

	public static void main(String[] args)
	{
		methodoverloading.addition();
		methodoverloading.sub();
		methodoverloading.mul();

	}
	public static void addition()
	{
		int a,b,c;
		a=10;b=45;
		c=a+b;
		System.out.println(c);
	}
	static void sub()
	{

		int a,b,c;
		a=10;b=45;
		c=a-b;
		System.out.println(c);
	}
	static void mul()
	{

		int a,b,c;
		a=10;b=45;
		c=a*b;
		System.out.println(c);
	}

}
