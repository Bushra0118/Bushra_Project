package com.home1;

public class TestingStringPractice {

	public static void main(String[] args) {
		
		String a=("bushra");
		String ab =new String(" chowdhury");//emutable
		      // a=("zaheer");
		System.out.println(a.concat(ab));
	
   StringBuffer Bufferobj = new StringBuffer ("Bushra");
   Bufferobj.append(" chowdhury");
   System.out.println(Bufferobj);
	
   StringBuilder Builder = new StringBuilder ("Zaheer");
   Builder.append(" Zaman");
   System.out.println(Builder);//StringBuilder is not synconize
	
	String s = new String("Bangladesh");//reverse String 
	String newobj = new StringBuffer(s).reverse().toString();
	System.out.println(newobj);
	
	String name = new String ("bushra1234$%");
	//System.out.println(name.charAt(a));
	
	
	}

}
