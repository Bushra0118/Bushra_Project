package com.automation;

public class JavaLoop {
	public static void main(String[] args) {
		
		
		//for(int i=0;i<=10;i++) {  // for loop
		//System.out.println(i);
		//}
        String b ="I AM LIVING IN NY";
		System.out.println("End point ="+b.length());// end point or total point
		String name = "My name is Bushra";
		for(int i=0;i<name.length();i++) {    //for letter end point = "+name.lenght());
		System.out.println(name.charAt(i));
		}
	
	String a = "united state of America";	
	//formula = for (end;start;--)	
	//reverse String value	
	//formula	
	
       for(int i=a.length()-1;i>=0;i--) {
	System.out.println(a.charAt(i));
       
       }
       StringBuilder obj = new StringBuilder(a);
       System.out.println(obj.reverse());	
	
	}
	
}

	
