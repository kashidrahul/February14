package Constructor;

public class sample6 
{
	int num3;    //60
	int num4;    //20
	
	//user defined constructor  --> with parameter
	sample6(int c, int d)  //60 20
	{
		num3=c;     //60
		num4=d;		//20
	}

	
	public void sub() 
	{
		System.out.println(num3-num4);    //60-20=40
	}
	
	
}

