package com.javapolymorphism;

public class Basic2 extends ClassA {

	public static void main(String[] args) {
	
		Basic2 obj =new Basic2();
	obj.Test1();
	
}
	@Override
	public void Test1() {
		System.out.println("This is my overriding ");
	}

	
}
