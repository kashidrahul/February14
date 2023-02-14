package Control_Statement;

public class example4_nested_if 
{
	
	public static void main(String[] args)
	{
		
		int PE=70;
		int ME=80;
		
		//70>=60
		if(PE>=60)             //outer if
		{
			System.out.println("PE pass --> Eligible for ME");
			
			//0>=80
			if(ME>=80)         //inner or nested if
			{				
				System.out.println("got selected  --> ME>=80");
			}
			else 
			{
				System.out.println("Rejected --> ME<80");
			}						
		}
		else 
		{
			System.out.println("PE Fail --> Not Eligible for ME");
			
		}
		
		
		
		
		
		
		
		
	}

}

