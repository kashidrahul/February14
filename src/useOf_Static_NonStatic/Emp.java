package useOf_Static_NonStatic;

public class Emp 
{
	String empName;
	int empID;
//	String empCEOName;
	static String empCEOName;
	
	public void showInfo()
	{
		System.out.println(empName+": "+empID+": "+empCEOName);
	}
	
	
}

