package Exception_Handling;

public class example6
{
	public static void main(String[] args) 
	{
		
		int [] ar=new int[4];
		
		try
		{
			ar[9]=5;
		}
		catch (ArithmeticException e) 
		{
			System.out.println("ArithmeticException handled");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(Exception a)
		{
			System.out.println("generic Exception handled");
			a.printStackTrace();
		}
		
		
		System.out.println("Hi");
		
		
	}

}
