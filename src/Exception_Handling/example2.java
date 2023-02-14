package Exception_Handling;

public class example2 
{
	public static void main(String[] args)
	{
		int [] ar=new int[4];
		
		try
		{
			ar[6]=5;
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");	
		}
		
				
		System.out.println("Hi");
		
		
	}

}
