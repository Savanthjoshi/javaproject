package javanew;

public class methodcalling {

	public methodcalling() {
		
	}

	public static void main(String[] args) 
	{
       methodcalling.addition();
       methodcalling.sub();
    
     
	}
    public static void addition()
    {
    	int a,b,c;
    	a=5;b=6;
    	c=a+b;
    	System.out.println(c);
    }
    static void sub()
    {
    	int a,b,c;
    	a=5;b=6;
    	c=a-b;
    	System.out.println(c);
    }
   public void multiplication()
    {
    	int a,b,c;
    	a=5;b=6;
    	c=a*b;
    	System.out.println(c);
    }
}
