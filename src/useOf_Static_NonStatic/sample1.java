package useOf_Static_NonStatic;

public class sample1 
{
	public static void main(String[] args) 
	{
		
		Emp e1=new Emp();
		e1.empName="rahul";
		e1.empID=101;
		//e1.empCEOName="abc";
		Emp.empCEOName="abc";
		
		Emp e2=new Emp();
		e2.empName="ganesh";
		e2.empID=102;
		//e2.empCEOName="abc";
		Emp.empCEOName="abc";
		
		Emp e3=new Emp();
		e3.empName="Atul";
		e3.empID=103;
		//e3.empCEOName="xyz";
		Emp.empCEOName="xyz";
		
		
		e1.showInfo();
		e2.showInfo();
		e3.showInfo();
		
	}

}
