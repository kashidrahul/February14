package Pattern_Program;

public class Pattern16 
{
	public static void main(String[] args) 
	{
		//*
		// **
		//  ***
		//   ****
		//  ***
		// **
		//*
		
		
		int star=1;
		int space=0;
		
		for(int i=1;i<=7;i++)
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
				star++;
				space++;
			}
			else
			{
				star--;
				space--;
			}
		}
		
	}

}
