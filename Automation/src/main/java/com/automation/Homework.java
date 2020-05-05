package com.automation;

public class Homework {
   
	 public void getsalary() {
		 int age= 10;
		 String name = "zaheer";
		 double gpa = 5.5;
	System.out.println(age);
	System.out.println(name);
	System.out.println(gpa);
	 }
	 static int getincome() {
	 return 5000;
	   }
  public String getname() {
	 return "bushra"; 
  }
  
  
	 public static void main(String[] args) {
	Homework obj = new Homework() ;
		obj.getsalary();
    int a= Homework.getincome();
      System.out.println(a);
 String b= obj.getname();
  System.out.println(b);
	 }
	 
}