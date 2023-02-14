package Methods;

public class Sample7 
{
	
	//example 5: method without/zero parameter
	
	public static void main(String[] args) 
	{
		//1 static method call from same class
		m1();
		
		System.out.println("------");
		
		//2 static method call from diff class
		sample8.m2();
		
		System.out.println("------");
		
		//3 non-static method call from same class
		Sample7 s7=new Sample7();
		s7.m3();
		
		System.out.println("-------");
		
		//4 non-static method call from diff class
		sample8 s8=new sample8();
		s8.m4();
		
	}
	
	
	public static void m1()  //method without/zero parameter
	{
		System.out.println("running static method m1 from same class");
	}
	
	
	public void m3()     //method without/zero parameter
	{
		System.out.println("running non-static method m3 from same class");
	}
	
	

}

