package Pattern_Program;

public class Pattern12
{
	public static void main(String[] args) {
		
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		int star=1;//initialise first row star value
		
		for(int i=1; i<=9; i++)//row
		{
			for(int j=1; j<=star; j++)//column
			{
				System.out.print("*");
			}
			System.out.println();
						
			if(i<5) //condition
			{
				star++;
			}
			else 
			{
				star--;
			}			
			
		}
		
		
		
	}

}