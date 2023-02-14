package Pattern_Program;

public class Pattern11 
{
	public static void main(String[] args) 
	{
		//****
		//***
		//**
		//* 
		//**
		//***
		//****
		
		int star=4;
		
		for(int i=1; i<=7; i++) //row=i
		{
			for(int j=1; j<=star; j++) //column
			{
				System.out.print("*");
			}
			System.out.println();
						
			if(i<4) //condition for inner for loop
			{
				star--;
			}
			else 
			{
				star++;
			}			
		}		
	}

}
