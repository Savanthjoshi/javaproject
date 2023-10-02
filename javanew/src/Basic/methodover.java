package Basic;

public class methodover {

	public methodover() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		methodover.add();
		methodover.add(1);
        methodover.add(10.6f, 32.50);		
        methodover.add(10, 10.258f);
	}
	public static void add()
	{
		System.out.println("this is default");
	}
	public static void add(int a)
	{
		System.out.println("this is 1 int parameter");
	}

	public static void add(int a,float b)
	{
		System.out.println("this is int and float parameter");
	}

	public static void add(float a, double b)
	{
		System.out.println("this is float and double parameter");
	}


	
}
