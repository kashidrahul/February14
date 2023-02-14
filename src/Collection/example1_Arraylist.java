package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example1_Arraylist 
{
	public static void main(String[] args) 
	{
		
		//ArrayList al=new ArrayList();   //Bydefault initial capacity = 10
		ArrayList al=new ArrayList(8);    //initial capacity = 8
		al.add("Rahul");
		al.add(100);
		al.add('A');
		al.add(65.5f);
		al.add("Rahul");
		al.add(null);
		al.add(null);
			
		System.out.println(al);
		System.out.println(al.size());    //7
		System.out.println(al.isEmpty());  //false
		System.out.println(al.contains('A'));  //true
		System.out.println(al.get(3));    //65.5
		
		System.out.println(al);
		//add/insert data in between arraylist  --> right shift operation
		al.add(4, 500); 		
		System.out.println(al);
				
		//remove/delete data in between arraylist
		al.remove(4);
		System.out.println(al);
				
		//update/modify data from arraylist
		al.set(3, 75.5f);
		System.out.println(al);
		
		System.out.println("----Print all data using Iterator cursor-----");
		
		Iterator itr = al.iterator();	
		
		while(itr.hasNext())     //false
		{
			System.out.println(itr.next());
		}
		
				
		System.out.println("----Print all data using ListIterator cursor-----");	
		
		ListIterator litr = al.listIterator();
		while(litr.hasNext()) 
		{
			System.out.println(litr.next());
		}
				
		System.out.println("----Print all data using for loop-----");		
		for(int i=0; i<=al.size()-1; i++) 
		{
			System.out.println(al.get(i));
		}
				
		System.out.println("----Print all data using foreach loop-----");		
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		
		
	}

}

		
		
	


