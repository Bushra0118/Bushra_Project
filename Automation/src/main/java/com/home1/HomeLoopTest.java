package com.home1;

import java.util.Arrays;

public class HomeLoopTest {

  static String country="United State Of America";
  public static void main(String[] args) {
	//how many ee's in there?
	  for(int i=0;i<country.length(); i++ ) {
		if(country.charAt(i)=='e') {
			System.out.println(country.charAt(i));
		}
	  }
	    // in order with 4 pieces
	  String[] pieces= country.split("  ");
     System.out.println(Arrays.toString(pieces));
  
 //in order or straight with loop
     for(int i=0;i<country.length();i++) {
     System.out.println(country.charAt(i));
     }
//reverse with loop
     for(int i=country.length()-1;i>=0;i--) {
     System.out.println(country.charAt(i));
      }
 //   reverse without loop
     StringBuilder builder=new StringBuilder("United State Of America");
     String obj = new String(builder.reverse());
     System.out.println("this only reverse="   +obj);
    
     //even and odd number
     for(int i=0;i<=10;i++) {
     if(i%2==0) {
 System.out.println("This is even number=" +i);
     }
     else {
     System.out.println("Odd numbrt="+i);
     }
     if(i%3==0 && i%5==0) {
    System.out.println("This is FIZBUZZ number="+i);
      }
    if(i%3==0) {
    System.out.println("this is FIZ number="+i);
    }
    if(i%5==0) {
    System.out.println("This is BUZZ number=+i");
    
    } 
     }
     
     }
}