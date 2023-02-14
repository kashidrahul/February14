package Methods;

public class sample11 
{
	
	public static void main(String[] args)
	{		
		studentFullName("abc","xyz");
		studentFullName("abc1", "xyz1");
		
		System.out.println("--------------------");
		
		sample11 s11=new sample11();
		s11.studentInfo("rahul", 100, 'A', 75.5f);
		System.out.println("---");
		s11.studentInfo("ganesh", 101, 'B', 76.5f);
	}
	
	
	//method with String, int, char, float parameter
	public void studentInfo(String name,int rollNum,char grade, float per)
	{
		System.out.println("Student name: "+name);
		System.out.println("Student roll num: "+rollNum);
		System.out.println("Student grade: "+grade);
		System.out.println("Student percentage: "+per+"%");
	}
	
	
	//string,string (2 String) parameter method
	public static void studentFullName(String FN, String LN)
	{
		System.out.println(FN +" "+ LN);
	}
	
	
	
	
//	//method with String, int, char, float parameter
//	public void studentInfo(String name,int rollNum,char grade, float per)
//	{
//		System.out.println(name+": "+rollNum+": "+grade+": "+per);
//	}

}

