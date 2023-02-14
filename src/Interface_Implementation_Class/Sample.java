package Interface_Implementation_Class;

//sub class or IC 

//Example of multiple inheritance using interface

public class Sample implements I1, I2
{	
	public void m1() 
	{
		System.out.println("method m1 from interface I1 completed in IC");
	}
	
	public void m2() 
	{
		System.out.println("method m2 from interface I1 completed in IC");
	}
	
	public void m3() 
	{
		System.out.println("method m3 interface I2 completed in IC");
	}
	
	public void m4() 
	{
		System.out.println("method m4 interface I2 completed in IC");
	}
	
}

