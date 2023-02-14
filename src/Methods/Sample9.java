package Methods;

public class Sample9
{
	//example6: method with parameter
	
	public static void main(String[] args)
	{		
		addition(10,20);     //30
		addition(5, 6);      //11
		addition(100, 200);  //300
		
		System.out.println("------------------");
		
		Sample9 s9=new Sample9();
		s9.multiplication(4, 3);
		s9.multiplication(7, 8);
		
		System.out.println("-------------------");
		
		Sample10.substraction(40, 5);   //35 
		Sample10.substraction(7, 15);   //-8
				
	}
	
	//method with int, int(2 int) parameter
	public static void addition(int a, int b)   //a=100, b=200
	{
		System.out.println(a+b);    //100+200 =300
	}
	
	//method with int, int(2 int) parameter
	public void multiplication(int c, int d)  //c=7, d=8
	{
		System.out.println(c*d);   //7*8 =56
	}
	
	


}

