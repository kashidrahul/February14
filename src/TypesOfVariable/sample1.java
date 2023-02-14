package TypesOfVariable;

public class sample1
{	
	//1: example of local & global variable
	
	int c=30;    //global variable
	
	public void m1()
	{
		int a=10;      //local variable
		System.out.println(a);   //10
		System.out.println(c);   //30		
	}
	
	public void m2()
	{
		//System.out.println(a);
		int b=20;    //local variable
		System.out.println(b);    //20
		System.out.println(c);    //30
	}
	
	
}
