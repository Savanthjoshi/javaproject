package Basic;

public interface hybrid extends three, two
{
static void play()
  {
    System.out.println("this is interface hybrid");
   }
}


interface three
{
	static void IOSUpdates()
	 
	 {
		 System.out.println("this is ios update");
	 }
}


 interface two
 {
	 static void store()
	 {
		 System.out.println("this is store");
	 }
 }
 
 class cars implements hybrid
{ 
	public void swift()
	{
		System.out.println("this is car swift");
	}

	public void IOSUpdates() {
		// TODO Auto-generated method stub
		
	}

	public void play() {
		// TODO Auto-generated method stub
		
	}
}


 class bikes implements hybrid
 {
	public void splendor()
	 {
		 System.out.println(" this is bike splendor");
	 }

	public void IOSUpdates() {
		// TODO Auto-generated method stub
		
	}

	public void play() {
		// TODO Auto-generated method stub
		
	}
 }
