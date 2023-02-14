package Array;

import java.util.Arrays;

public class example5_ArraySorting
{
	public static void main(String[] args)
	{
		
		int [] ar=new int[5];
		
		ar[0]=50;    //10
		ar[1]=10;    //20
		ar[2]=30;    //30
		ar[3]=40;    //40
		ar[4]=20;    //50
		
		
		System.out.println("--print original data---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		Arrays.sort(ar);       //{10 , 20 , 30 , 40 , 50}       
		
		System.out.println("--print data in ascending order---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("--print data in descending order---");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
	}

}

