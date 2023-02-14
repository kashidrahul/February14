package Pattern_Program;

public class Pattern5
{
	//***
	//**
	//*
	
	public static void main(String[] args)
	{
		
		int star=3;   //0
		
		//           4<=3
		for(int i=1; i<=3; i++)      //outer for loop --> rows 
		{   //           2<=1
			for(int j=1; j<=star; j++)    // inner for loop --> cols
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		
				
	}

}
