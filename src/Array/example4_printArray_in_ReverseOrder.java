package Array;

public class example4_printArray_in_ReverseOrder 
{
	public static void main(String[] args)
	{
		
		int [] ar=new int[5];
		
		ar[0]=50;
		ar[1]=10;
		ar[2]=30;
		ar[3]=40;
		ar[4]=20;
		
		System.out.println("----print all original data-----");
			
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----print array in reverse order-----");
		
//			for(int i=4; i>=0; i--)
//			{
//				System.out.println(ar[i]);
//			}
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
				
	}

}
