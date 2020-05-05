package com.practice;

public class TastingMethod {

   void getsalary() {

    System.out.println("this is my void method");
   }

    String getmoney(){

      return"5000";
    }

static void name() {
	
}

public static void main(String[] args) {
	TastingMethod obj = new TastingMethod();
	obj.getsalary();
	obj.getmoney();
	
	
	System.out.println("my getmoney is="  +obj.getmoney());

}


}
