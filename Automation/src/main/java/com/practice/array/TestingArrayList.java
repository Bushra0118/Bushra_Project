package com.practice.array;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class TestingArrayList {
	public static void main(String[] args) {
	
	//milk,butter,sugar//how to add obj inside a list
	
	//List<String> list = new ArrayList<>();
	
	//list.add("milk");
	//list.add("butter");
	//list.add("sugur");
	//System.out.println(list);
	
	//50,40,10,20,30,
	List<Integer> list= new ArrayList<>();
	list.add(50);
	list.add(40);
	list.add(10);
	list.add(20);
	list.add(30);
	System.out.println(list);
	 
	
	for(int i =0; i<list.size(); i++) {
		System.out.println(list.get(i));
	}
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		Collections.sort(list);
		System.out.println(list);
	
	
	
	
	
	}
	
}
