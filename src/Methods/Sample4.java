package Methods;

public class Sample4 
{
	//3.Non static method call from same class
	
	
	public static void main(String[] args) 
	{
		
		// classname objectname= new classname();->syntax of object creation
		Sample4 s4 = new Sample4();// 1.creat object of same class
		s4.m3();                   //2. method call --> objectname.methodname();
		s4.m4();
		
		
		//1. sample4   --> classname  --> datatype
	    //2. s4 --> objectname   --> to identify/refer object
		//3. new --> keyword   --> to create blank/empty object
		//4. sample4() --> classname()  --> constructor  --> use to copy all the data into object

	}

	//non-static regular method
	public void m3() 
	{
		System.out.println("running non-static regular method M3");	
		
	}

	//non-static regular method
		public void m4() 
		{
			System.out.println("running non-static regular method M4");	
		}

}
