package Array;

public class example1_intArray 
{
	public static void main(String[] args) 
	{		
		//step1: array declaration
		int [] ar=new int[5];
		
		//step2: array initialization
		ar[0]=50;
		ar[1]=10;
		ar[2]=30;
		ar[3]=40;
		ar[4]=20;
		//ar[5]=100;
		
		//step3: array usage
		System.out.println(ar[4]);   //20
		System.out.println(ar.length);   //5
		
		System.out.println("----print all data from int array-----");
		
//		//           5<=4
//		for(int i=0; i<=4; i++)
//		{    //                   4 
//			System.out.println(ar[i]);    //50  10  30  40  20
//		}
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
				
	}
}

