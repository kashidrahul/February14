package Constructor;

public class sample4 
{
	//step1: global variable declaration
	int num3;   //50
	int num4;    //30
	
	//step2: global variable initialization
	//user defined constructor  --> provided by user
	//use1: to initialize global variable
	//use2: copy all the members of class into object
	sample4()
	{
		num3=50;
		num4=30;
	}
		
	public void sub()
	{
		System.out.println(num3-num4);
	}
	
	

}
