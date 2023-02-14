package This_and_super_keyword;

public class sample1 extends sample2
{	
	//int a=30;    //global variable from super class
	
	int a=20;      //global variable from current/same class
	
	public void m1()
	{
		int a=10;     //local variable
		System.out.println(a);    //10
		System.out.println(this.a);   //20
		System.out.println(super.a);
	}
	

}
