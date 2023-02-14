package Constructor;

public class sample3 
{
	//2. example of user define constructor
	
	//step1: declaration of global variable
	int num1;   //10
	int num2;    //20
	
	//step2: global variable initialization
	//user defined constructor  --> provided by user
	//use1: initialize global variable
	//use2: copy all the members of class into object
	sample3()
	{
		num1=10;
		num2=20;		
	}
	
	//usage
	public void addition()
	{
		System.out.println(num1+num2);
	}
	
	public void multiplication()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) {
				
		sample3 s3=new sample3();
		s3.addition();
		s3.multiplication();
		
		System.out.println("------");
		
		sample4 s4=new sample4();
		s4.sub();
	}
	
}

