package Access_Specifiers;

public class sample3 
{
	//2. example of default access specifier
	
	int a;      // default access specifier
	 
	
	sample3()    // default access specifier
	{
		a=20;
	}
	
	
	void m1()       // default access specifier
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{		
		sample3 s3=new sample3();
		s3.m1();
		System.out.println(s3.a);
				
	}
	

}
