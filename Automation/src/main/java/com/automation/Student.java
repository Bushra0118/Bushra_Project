package com.automation;  //record 5843

public  class Student {
 static int c;
	static int a;
   void getsalary(){
   int  a=10;
   int b =20;
   c=a=b;
   System.out.println(a); 
   }
    		
   String getmoney() {
   System.out.println();
     return "bushra";
      }
  static void getincome() {
 System.out.println();
 }

 static  int getfood() { //return bec there is no void word
	  return 10;
 
  }
 
  public static void main(String[] args) {
	Student obj = new Student();
    obj.getsalary();
    Student.getincome();
   System.out.println(Student.getfood());
  }

  }
  
  
