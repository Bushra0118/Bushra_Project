package com.practice.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testinglist {

//milk,meat,egg//how to add obj inside the list
	//80,70,90,60,50,
	public static void main(String[] args) {
	
 // List<String> list= new ArrayList<>();
  
 // list.add("milk");
 // list.add("meat");
  //list.add("egg");
 // System.out.println(list);
  
  List<Integer> list =new ArrayList<>();
  list.add(80);
  list.add(70);
  list.add(90);
  list.add(60);
  list.add(50);
  System.out.println(list);
  System.out.println(list.size());
  for(int i=0; i<list.size();i++) {
	  System.out.println(list.get(i));
  }
 
	System.out.println(Collections.max(list));
	System.out.println(Collections.min(list));
	Collections.sort(list);//assording number small to big
	System.out.println(list);
	
	
	
	}
  
  
  
  
 
  
  
  
  

}







