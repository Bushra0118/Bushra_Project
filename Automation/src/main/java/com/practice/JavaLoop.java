package com.practice;

import java.util.Arrays;

public class JavaLoop {

	public static void main(String[] args) {
		
	String a = "UNITED STATE OF AMERICA";
	//System.out.println(a);
	
	
	
	for(int i=0; i<a.length(); i++)	{
		System.out.println(a.charAt(i));
	if(a.charAt(i)=='I') {
		System.out.println("matched="  +a.charAt(i));
	} else {
		//System.out.println("unmatched="  +a.charAt(i));
	}
	}
	//a.split(" ");
		System.out.println(Arrays.toString(a.split(" ")));
	
	for(int i=a.length()-1; i>=0; i--) {//rev for loop
		System.out.println(a.charAt(i));
	}
	
	StringBuffer obj = new StringBuffer(a);
	StringBuffer b = obj.reverse();
	System.out.println(b);
	
	String s= "I Live in NewYork";
	
	s.split(" ");
	System.out.println(Arrays.toString(s.split(" ")));
	
	//0 to 40 =>int
	
	
		for(int i=0;i<=40;i++) {
			System.out.println(i);
			
			//for letter end point = "+name.lenght());
		}
			String name ="I m liveing in new york";
			System.out.println("End point ="+name.length());
		
			for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
			}
		
		//String text = "united state of America";	
		
	       
		
		
			

	}
	
	}




