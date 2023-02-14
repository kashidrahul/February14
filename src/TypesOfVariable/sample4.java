package TypesOfVariable;

public class sample4 
{
	//example of non-static global variable
	
	int d=10;    //non-static global variable
	
	
	public static void main(String[] args)
	{		
		//1. non-static global variable call from same class
		sample4 s4=new sample4();
		System.out.println(s4.d);
		
		//2. non-static global variable call from diff class
		sample5 s6=new sample5();
		System.out.println(s6.e);
			
	}
	
	
	public static void m1()
	{
		sample4 s5=new sample4();
		System.out.println(s5.d);		
	}
	
	
	public void m2()
	{
		System.out.println(d);
	}
	
	
	
	
}

