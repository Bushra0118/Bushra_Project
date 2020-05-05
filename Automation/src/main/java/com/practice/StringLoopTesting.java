package com.practice;

import java.util.Arrays;

public class StringLoopTesting {
public static void main(String[] args) {
	//Positive loop
     for(int i=1; i<=10; i++) {
     System.out.println(i);
    	 }
  for(int i=1; i<=10; i++) {//even number
     if(i%2==0) {
 System.out.println("This is even num=" +i);
     }
     else {
    	 System.out.println("This is odd num=" +i);
     }
  } 
     //Negative or reserve loop
for(int i=10; i>=0; i--) {
  System.out.println(i);
}     
//reverse order by using loop
 String a= "UNITED STATE OF AMERICA";
  for(int i=a.length()-1;i>=0; i--) {
System.out.println(a.charAt(i));

  }
 //reverse order without loop
  StringBuilder obj= new StringBuilder(a);
  System.out.println(obj.reverse());
//lenght method
   System.out.println(a.length());
//
  for(int i=0; i<a.length();i++) {
  System.out.println(a.charAt(i));
  }
//

}
}