package Pattern_Program;

public class Pattern13
{
	public static void main(String[] args)
	{
		//   *
		//  **
		// ***
		//****
		// ***
		//  **
		//   *
		
		
		int space=3;
		int star=1;
		for(int i=1; i<=7; i++) //row
		{
			for(int j=1; j<=space; j++) //space
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) //column/star
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4) //conditions
			{
				space--;
				star++;
			}
			else 
			{
				space++;
				star--;
			}
			
		}
		
		
		
	}

}
