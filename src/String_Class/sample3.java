package String_Class;

public class sample3
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="ABCD";
		String s3="abcd";
		String s4="my name is rahul";
		String s5="abcabcab";
		String s6="";

		
		System.out.println(s1.length());     //8
		System.out.println(s1.toUpperCase());   //VELOCITY
		System.out.println(s2.toLowerCase());  //abcd
		System.out.println(s2.equals(s3));    //false    //case sensitive
		System.out.println(s2.equalsIgnoreCase(s3));   //true   //not a case sensitive
		System.out.println(s4.contains("name"));      //name
		
		System.out.println("---------------");
		
		System.out.println(s1.charAt(6));    //t
		System.out.println(s5.indexOf('b'));   //1
		System.out.println(s5.lastIndexOf('a'));  //6
		System.out.println(s5.isEmpty());   //false
		System.out.println(s6.isEmpty());    //true
		System.out.println(s4.startsWith("my"));  //true
		System.out.println(s4.endsWith("rahul")); //true
		
		System.out.println("--------------");
		System.out.println(s4.replace("rahul", "ganesh"));  //my name is ganesh
		System.out.println(s2+s3);  //ABCDabcd
		System.out.println(s2.concat(s3).concat(s4));   //ABCDabcd
			
	}

}

