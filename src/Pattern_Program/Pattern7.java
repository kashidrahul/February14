package Pattern_Program;


public class Pattern7
{
	public static void main(String[] args)
	{
		//  *
		// **
		//***
		
		int space=2;//1
		int star=1;//2
		
		//           4<=3 loop break
		for(int i=1; i<=3; i++)//rows1,2,3
		{   //           1<=0
			for(int j=1; j<=space; j++)//space print
			{
				System.out.print(" ");
			}
			space--;//1,0
			
			//           4<=3
			for(int j=1; j<=star; j++)//column
			{
				System.out.print("*");
			}
			
			star++;		 //2,3
			System.out.println();
		}
		
		
	}
}

