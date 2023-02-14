package Exception_Handling;

public class example1
{
	public static void main(String[] args) 
	{
		
		int a=10;
		int b=0;
		
		int c=0;        
		
		
		try
		{
			c=a/b;			 //risky code   //10/0 = 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception handled");			
		}
				
		System.out.println(c);
		System.out.println("Hello");
		
		
		
		
		
	}

}
