package Exception_Handling;

public class example4
{
	public static void main(String[] args) 
	{
		
		int [] ar=new int[4];
		
		try
		{
			ar[9]=5;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hi");
		
		
	}

}
