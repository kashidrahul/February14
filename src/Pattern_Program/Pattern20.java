package Pattern_Program;

public class Pattern20 

{
	//   1
	//  2 2
	// 3 3 3
	//4 4 4 4
	
	
	public static void main(String[] args) 
	{
		int space=3;
		int number=1;
		
		for(int i=1;i<=4;i++)//row
		{
			for(int j=1;j<=space;j++)//column/space
			{
				System.out.print(" ");
			}
			space--;
			
			for(int j=1;j<=number;j++)//column/
			{
				System.out.print(i+" ");
			}
			number++;
			System.out.println();
		
		}
		
	}

}
