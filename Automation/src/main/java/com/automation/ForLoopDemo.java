package com.automation;

public class ForLoopDemo {
 
	//if any number div by 3 and 5 its call print FIZBUZZ any num div by 2 and div by 6
  
	public static void main(String[] args) {
	//how to find even number for 0 to 10?( even mean2.4.6

	   for(int i=0;  i<=50; i++) {
	   if(i%2==0) {//for even number
		   //i/3 &1/5 ==> i%3==0 && i%5==0 for fizbuzz
		  if(i%3==0 && i%5==0) {
		     System.out.println("This is even number ="+i);  
			  System.out.println("This is FIZBUZZ number ="+i);
		  }
	   }
		  if(i%3==0) {
			  System.out.println("This is FIZ number ="+i);
		  }
		  
		   else {  // not i/2== odd number
	   
	   System.out.println("odd number = "+i);
	   
	   }
	   
	   }
	   for(int i=10; i>=1; i--) {//decrement for loop
   
       System.out.println(i);
       }
  

	  
	 //  for(int i=0;;i++) {//if you take off middle part its called infinite time
// System.out.println(i);
  // }//how to print every 5th number from a loop?

	  
	  for(int i=0;i<100;i++) {    //how to break your loop in 50? or
  System.out.println(i);         // 0 to 100 but find only 20
	if(i==50) {
   break;
   }
   }
}
}