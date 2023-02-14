package Array;


public class example7_StringArray_declarationInitialization_inSingleStep
{
	public static void main(String[] args) 
	{
		
		String [] ar= {"rahul","ganesh","mahesh", "suresh"};
		
		
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		
		System.out.println("---print all data from array--");
		
		for(int i=0; i<=ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
		
	}

}
