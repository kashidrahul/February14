package Generalization;

//IC2

public class Airtel implements SimCard
{
	public void audioCalling()
	{
		System.out.println("audio calling: 150");
	}
	
	public void sms() 
	{
		System.out.println("sms: 60");
	}
	
	public void internet()
	{
		System.out.println("internet: 2GB");		
	}
	
	public void newFeatureB() 
	{
		System.out.println("newFeature: B");
	}
	
}

