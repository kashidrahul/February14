package Methods;

public class Sample1 
{
	// 1.Static regular method call from same class
	
	// main method
	public static void main(String[] args) //pre-defined method
	{
		System.out.println("Hii");
		
		m1();// methodname();
		m2();
		m3();
		
		System.out.println("Hello");
	}
// Static-> regular method
	
	public static void m1() //-> user defined method
	{
		System.out.println("running static regular method m1");

	}
	// Static-> regular method
	public static void m2() //-> user defined method
	{
		System.out.println("running static regular method m2");
	}
	// Static-> regular method
		public static void m3() //-> user defined method
		{
			System.out.println("running static regular method m3");
		}
		}

