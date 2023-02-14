package String_Class;


public class sample4
{
	public static void main(String[] args)
	{
		String s1="my name is rahul";
		
		String[] ar = s1.split(" ");     // {my(0),  name(1),  is(2),  rahul(3)}
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("------------------");
		
		System.out.println(ar[3]);
		
		
		
//		String s2=" sanjay";
//		System.out.println(s2.trim());
		
	}

}
