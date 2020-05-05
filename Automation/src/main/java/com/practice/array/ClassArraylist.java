package com.practice.array;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassArraylist {

  public static void main(String[] args) {
	
	  
	  
 // List<String> list= new ArrayList<>();
  
 // list.add("vegetable");
 // list.add("butter");
 // list.add("water");
 // System.out.println(list);
  
//System.out.println(list.size());
  
 // for(int i=0;i<list.size();i++) {
  
 // System.out.println(list.get(i));
  //}
  
	  //10,20,30
	  
 List<Integer> list =new ArrayList<>();
 list.add(10);
 list.add(20);
 list.add(30);
 list.add(40);

 
 System.out.println(list);
  //for(int i=0; i<list.size();i++) {
	//System.out.println(list.get(i));  
 // }
   System.out.println(Collections.max(list));
   System.out.println(Collections.min(list));
   //asording order= small number will 1st

  Collections.sort(list);
  System.out.println(list);
 
 
  
  
  
  }





}
