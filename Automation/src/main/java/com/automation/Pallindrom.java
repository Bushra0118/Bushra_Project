package com.automation;

import java.util.Arrays;

public class Pallindrom {

	static String country ="UNITED STSTE OF AMERICA";//variable handel one value at time
       //static int a = 10;
      //static String beforerReverse =" MOM";
      //find out MOM is a Pallindrom number::before reverse<==>after reverse is same 
       public static void main(String[] args) {
	
	 String[] pieces= country.split("");//4 pieces==>more then one value==> Array=[]
  
	  System.out.println(Arrays.toString(pieces));
	  
  //for(int i = 0;i<pieces.length;i++) {
	  
	  
	 //  System.out.println(pieces[i]);

 // StringBuilder builder = new StringBuilder(beforerReverse);
	   
	//if (beforerReverse.equals(builder.reverse().toString())) {
	   System.out.println("A Palinfrome number");
	//}
	 
	 System.out.println(Arrays.toString(country.split(" ")));
       
       
       } 
	   

	   }






