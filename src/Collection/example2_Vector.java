package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class example2_Vector
{
	public static void main(String[] args) 
	{		
		Vector V=new Vector();   //Bydefault initiV capacity = 10
		V.add("Rahul");
		V.add(100);
		V.add('A');
		V.add(65.5f);
		V.add("Rahul");
		V.add(null);
		V.add(null);
		
		System.out.println(V.capacity());
			
		System.out.println(V);
		System.out.println(V.size());    //7
		System.out.println(V.isEmpty());  //false
		System.out.println(V.contains('A'));  //true
		System.out.println(V.get(3));    //65.5
		
		System.out.println(V);
		//add/insert data in between Vector  --> right shift operation
		V.add(4, 500); 		
		System.out.println(V);
				
		//remove/delete data in between Vector --> left shift operation
		V.remove(4);
		System.out.println(V);
				
		//update/modify data from Vector
		V.set(3, 75.5f);
		System.out.println(V);
		
		System.out.println("----Print Vector data using Iterator cursor-----");
		Iterator itr = V.iterator();		
		while(itr.hasNext())     //fVse
		{
			System.out.println(itr.next());
		}
				
		System.out.println("----Print Vector data using ListIterator cursor-----");		
		ListIterator litr = V.listIterator();
		while(litr.hasNext()) 
		{
			System.out.println(litr.next());
		}
				
		System.out.println("----Print Vector data using for loop-----");		
		for(int i=0; i<=V.size()-1; i++) 
		{
			System.out.println(V.get(i));
		}
				
		System.out.println("----Print Vector data using foreach loop-----");		
		
		for(Object s1:V)
		{
			System.out.println(s1);
		}
		
		
		System.out.println("----Print Vector data using Enumeration cursor-----");	
		Enumeration enu = V.elements();
		
		while(enu.hasMoreElements()) 
		{
			System.out.println(enu.nextElement());
		}
		
			
	}

}

