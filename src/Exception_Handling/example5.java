package Exception_Handling;

public class example5
{
	public static void main(String[] args) 
	{
		
		int [] ar=new int[4];
		
		try
		{
			ar[9]=5;
		}
		catch(Exception a)
		{
			System.out.println("generic Exception handled");
			a.printStackTrace();
		}
		
		
		System.out.println("Hi");
		
		
	}

}

