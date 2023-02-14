package Exception_Handling;

public class example3 
{
	public static void main(String[] args) 
	{
		
		String s1="abc";
				
		try
		{
			System.out.println(s1.charAt(1));
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		
		
		System.out.println("hi");		
	}

}

