package Access_Specifiers;

public class sample6 
{
	//3. example of protected access specifier
	
	protected	int a;
	

	protected sample6() 
	{
		a=30;
	}
	
	protected void m1() 
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args)
	{		
		sample6 s6=new sample6();
		s6.m1();
		System.out.println(s6.a);
				
	}

}

