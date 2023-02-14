package Pattern_Program;

public class Pattern17 
{
	public static void main(String[] args) 
	{
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		
		int space=0;//initialise
		int star=7;//5,3,1,3,5
		
		for(int i=1;i<=7;i++)//row
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		
			if(i<4)
			{
				space++;
				star=star-2;
			}
			else
			{
				space--;
				star=star+2;
			}
		}
		
	}

}
