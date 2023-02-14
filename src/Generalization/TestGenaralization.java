package Generalization;

public class TestGenaralization 
{
	public static void main(String[] args) 
	{
		System.out.println("--Features of Jio simcard--");
		Jio j=new Jio();
		j.audioCalling();
		j.sms();
		j.internet();
		j.newFeatureA();
		
		System.out.println("--Features of Airtel simcard--");
		Airtel a=new Airtel();
		a.audioCalling();
		a.sms();
		a.internet();
		a.newFeatureB();
		
		System.out.println("--Features of VI simcard--");
		VI v=new VI();
		v.audioCalling();
		v.sms();
		v.internet();
		v.newFeatureC();
		
	}

}
