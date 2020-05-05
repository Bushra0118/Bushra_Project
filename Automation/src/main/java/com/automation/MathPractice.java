package com.automation;

public class MathPractice {

	 //swap a=20 b = 10 //                                         (03-26-20)
 static int a = 10;
  static int b = 20;

  public static void main(String[] args) {
	
	  
     // a=a+b=30
     // b=30-10
     // a = 30-b
    System.out.println("A value =" +a);
    System.out.println("b value="+b);
    a=a+b;//30
    System.out.println("A value changed to ="+a);
  b=a-b;
    System.out.println("B value changed to ="+b);
    a=a-b;
    System.out.println("A value changed to="+a);
    
    
    for(int i = 0;i< 200; i++) { //positive loop 0 to 200
   // System.out.println(i);

  }
 // for(end;start;--) { negative loop = 10 to 5
  for(int i=10;i>=5;i--) { 
  System.out.println(i);
  }
  }

}