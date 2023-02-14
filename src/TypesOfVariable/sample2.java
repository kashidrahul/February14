package TypesOfVariable;

public class sample2 
{
	static int a=10;    //static -->global variable from same class
	
	
	public static void main(String[] args)
	{
		//static global variable call from same class
		System.out.println(a);    //variableName
		
		//static global variable call from diff class
		System.out.println(sample3.b);  //DiffclassName.variablename
	}
	
	public static void m1() 
	{
		System.out.println(a);
	}
	
	public void m2() 
	{
		System.out.println(a);
	}

}

