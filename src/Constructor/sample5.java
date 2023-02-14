package Constructor;

public class sample5 
{	
	
	//3: example of user defined constructor with parameter
	
	int num1;   //4
	int num2;   //3
	
	//user defined with int,int(2 int) parameter constructor we can provide string also
	//use1: to initialize global variable
	sample5(int a, int b)  //4, 3
	{
		num1=a;     //4      //assign local variable info into global variable
		num2=b;     //3
	}
	
	
	public void addition() 
	{
		System.out.println(num1+num2);
	}
	
	public void multiplication() 
	{
		System.out.println(num1*num2);
	}
	
	
	public static void main(String[] args) {
		
		sample5 s5=new sample5(5,6);
		s5.addition();     //11
		s5.multiplication();    //30
		
		System.out.println("----");
		
		sample5 s6=new sample5(4, 3);
		s6.addition();      //7
		s6.multiplication();       //12
		
		System.out.println("--------------------------");
		
		sample6 s7=new sample6(80, 30);
		s7.sub();
		
		System.out.println("-----");
		
		sample6 s8=new sample6(60, 20);
		s8.sub();
				
	}
	

}

