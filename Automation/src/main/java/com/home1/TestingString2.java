package com.home1;

public class TestingString2 {
 
	
	public static void main(String[] args) {
		
		// for(int i=0;  i<=100; i++) {
	
			// if(i%3==0 && i%5==0) {
				// System.out.println("This is FIZBUZZ number ="+i);
			 // }
	
			// if(i%3==0) {
				// System.out.println("This is FIZ number ="+i);
		 
			// }
		// }

	//if(i%2==0) {
	//System.out.println("this is even number="+i);
	//}
	//}
	
		
		
		//united state of america===>reverse it with loop and without loop
		
		String a = "United State of America";
	
	System.out.println("Total number of letter=" +a.length());
		
		for(int i=a.length()-1;i>=0;i--) {//with loop
	System.out.println(a.charAt(i));
	}
	StringBuilder builder = new StringBuilder("United State of America");
	System.out.println(builder.reverse());

	}
}
