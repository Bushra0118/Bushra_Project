package com.automation;

public class Bushra {

	public void home() {
	
	
	int age=10;
	String name = "Zaheer";
	double GPA= 2.5;
	
	System.out.println("My name is :"+name);
	System.out.println("My age is:"+age);
	System.out.println("My GPA is:"+GPA);
	}
	
	static void getsalary() {
	int getsalary = 5000;
	System.out.println("My getsalary is:"+getsalary);
	}
		
	
	
		int getmoney() {
      return 1000;
		
		}
	public static void main(String[] args) {
	
	Bushra obj = new Bushra();// for void and return or non static method have to create obj
		obj.home();
	Bushra.getsalary();// for static no need to create obj, only classname.method 
	obj.getmoney();
	System.out.println(obj.getmoney());
}
	 }
	
	


