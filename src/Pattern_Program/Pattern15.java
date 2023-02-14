package Pattern_Program;

public class Pattern15 
{
	public static void main(String[] args) 
	{
		//  1
		// 1 1
		//1 1 1
		
		
		int space=2;
		int one = 1;
		
		for(int i=1;i<=3;i++) 
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");	
			}
			space--;
			
			for(int j=1;j<=one;j++)
			{
				System.out.print("1"+" ");
			}
			
			one++;
			System.out.println();
			
			
			
		}
		
	}

}

