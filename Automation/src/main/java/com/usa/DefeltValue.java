package com.usa;

public class DefeltValue {

static int a;//defelt value = o static varia
static double b;//defelt value = 0.0
static boolean c;// defult value = false

int j ;//instance variable
public static void main(String[] args) {
DefeltValue obj = new DefeltValue();
	obj.getsalary();
	int j =35;

	
	System.out.println(j);
	System.out.println(a);	
System.out.println(b);
System.out.println(c);

int d=50;//local variable
int e=30;
int f=d+e;

System.out.println(f);

}
 
public void getsalary() {

  int h =30;// local variable always inside the method.

System.out.println(h);

}
}
