package Pattern_Program;

public class pattern18
{
	public static void main(String[] args) 
	{
		
		//* * * * *
		//* * * * $
		//* * * $ $
		//* * $ $ $
		//* $ $ $ $
		//$ $ $ $ $
		
		
		int star=5;//4
	   int	doller=0;//1
	   
	   for(int i=1;i<=6;i++)//row
	   {
		   for(int j=1;j<=star;j++)
		   {
			   System.out.print("* ");//column/star
		   }
		   star--;
		   
		   for(int j=1;j<=doller;j++)//column/doller
		   {
			   System.out.print("$ ");
		   }
		   System.out.println();
		   
		   doller++;
			   
	   }
		
		
	}

}
