package com.automation;

public class Practice_Method {

	static int a = 10;

	static int b = 20;

	static int c;

	int getmoney() {
		c = b + a;
		System.out.println(c);
		return c;

	}

	static void getsalary() {

		c = b - a;
		System.out.println(c);

	}

	public static void main(String[] args) {
		Practice_Method x = new Practice_Method();
		System.out.println(x.getmoney());
		Practice_Method.getsalary();

	}
}
