package com.home1;

public class TestingStringJava {
 
	public static void main(String[] args) {
		
		String a =("Bushra");  // String is a immutable
	   String ab = new String(" Chowdhury");
		     //  a= ("zaheer");
		
		System.out.println(a.concat(ab));
	
		//String Buffer and Builder both is mutable
		//But Buffer is synchronized and Builder is faster
		
		
		StringBuffer Bufferobj= new StringBuffer ("Zaheer");//synchronize
		Bufferobj.append(" Zaman");
		System.out.println(Bufferobj);
		
		StringBuilder Builderobj= new StringBuilder ("Zaheer");//non synchronize
		Builderobj.append(" Zaman");
		System.out.println(Builderobj);
		
		String s =new String ("AMERICA");
		String newobj = new StringBuffer(s).reverse().toString();
		System.out.println(newobj);
		
		
	}

}
