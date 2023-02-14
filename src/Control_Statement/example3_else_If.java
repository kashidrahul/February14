package Control_Statement;

public class example3_else_If 
{
	public static void main(String[] args)
	{		
		int marks=65;
		
		// 62 >= 65
		if(marks>=65)      //condition1
		{
			System.out.println("Distinction");
		}
		//        62>=60 & 62<=64                         60-64
		else if (marks>=60 & marks<=64)    //condition2  
		{
			System.out.println("1st class");
		}
		//          //50-59
		else if (marks>=50 & marks<=59)   //condition3
		{
			System.out.println("2nd class");
		}
		//           //35-49
		else if (marks>=35 & marks<=49)   //condition4
		{
			System.out.println("Pass");
		}
		//  
		else if (marks<35) 
		{
			System.out.println("Fail");
		}
		
			
		
		
		
		
	}

}

