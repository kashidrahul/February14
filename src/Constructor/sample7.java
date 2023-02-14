package Constructor;

public class sample7 
{
	//example of multiple constructor  --> constructor overloading
	
	int num1;
	int num2;
	
	
	//without parameter constructor
    sample7()
	{
		num1=10;
		num2=20;
	}
	
	
	//with int,int parameter constructor
	sample7(int a, int b)  //5,6
	{
		num1=a;    //5
		num2=b;    //6
	}
	
	
	public void addition()
	{
		System.out.println(num1+num2);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		sample7 s7=new sample7(5,6);
		s7.addition();     //11
		
		
		sample7 s8=new sample7();
		s8.addition();     //30
		
		
		
		
	}
	
	
	
	
	

}
