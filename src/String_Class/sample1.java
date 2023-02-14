package String_Class;

public class sample1 
{
	public static void main(String[] args)
	{
		String s1;   //declaration		
		String s2="abc";  //declaration & initialization
		
	
		String s3="xyz";
		System.out.println(s3);   //xyz
		
		s3=s3+"ab";   //  xyz + ab  = xyzab
		System.out.println(s3);
		
		s3=s3+"cd";  //xyzab + cd  = xyzabcd
		System.out.println(s3);
		
		
		//Object creation of String
		//1. without using new keyword
		String s5="abc";
				
		//2. using new keyword
		String s6=new String("xyz");
		
		
		
	}

}
