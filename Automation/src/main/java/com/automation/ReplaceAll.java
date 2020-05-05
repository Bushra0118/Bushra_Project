package com.automation;

public class ReplaceAll {

	public static void main(String[] args) {
		
	
	
	String a = "united 123 state 4%of -/America = 123445 $#%"; //latter+number+special sign
	System.out.println(a.replaceAll("\\d", ""));
	 System.out.println(a);
   
	 
	 String a1= "Sarower";
   
     String b = "5000";
 
//  System.out.println("name is=" +a1);
//   System.out.println("salary is=" +b);
//  System.out.println("name is=" +a1);
//  System.out.println("salary is=" +a1);
//   //System.out.println("name is=" +a1," salary is=" +b);
//   
   //new java
 System.out.println(String.format("Name is %s Salary is %s", a1,b));	
//	
  System.out.println(String.format("Name is %s\nSalary is %s", a1,b));
	}
 
}

