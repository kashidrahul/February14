package casting;

//sub /child class

public class son extends father
{
	public void bike()
	{
		System.out.println("bike: FZ V3");
	}
		
	public void car()    //method override
	{
		System.out.println("car: kia seltos");
	}
	
	public void money()    //method override
	{
		System.out.println("Money: 2L");
	}
	
//	public void home() 
//	{
//		System.out.println("Home: 2bhk");
//	}
	
}

