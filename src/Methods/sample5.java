package Methods;

public class sample5 
{
	//4. non-static method call from diff class
	
	public static void main(String[] args)
	{
		
		Sample4 s4=new Sample4();    //1. Create object of diff class
		s4.m3();					//2. method call --> diffClassObjectName.methodname();
		s4.m4();
	
			
	}

}

