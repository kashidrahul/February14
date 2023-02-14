package Pattern_Program;

public class Pattern8
{
	public static void main(String[] args)
	{
		 //  *
		//  ***
	    // *****
		//*******
		
		int space=3;
		int star=1;
				
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=space; j++)//space
			{
				System.out.print(" ");
			}
			space--;//2,1,0
			
			for(int j=1; j<=star; j++)//column
			{
				System.out.print("*");
			}
			star=star+2;
			System.out.println();
			
		}

		
	}

}

