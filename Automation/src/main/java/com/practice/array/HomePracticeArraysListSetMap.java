package com.practice.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class HomePracticeArraysListSetMap {

	public static void main(String[] args) {
	
//10,20,30,40 Define Array, print Arrays,zero position last position, loop, 
//	 advance for loop or enhance for loop
// max and min
	 
	int[] a = {10,20,30,40};//Array declare single dimension
	int[][] b= {{10,20,},{30,40}};//two or multi dimension
  System.out.println(Arrays.toString(a)); //1
    int[] a1 = new int [4];//old way
//    a1[0]=10;
//    a1[1]=20;	
//    a1[3]=30;
//    a1[4]=40;
		   System.out.println(Arrays.toString(a1)); //2

  for(int i=0;i<a1.length; i++) { // basic for loop
  System.out.println("this is reserve loops=" +a1[i]);//3
  }
  for(int i:  a1) {// advance for loop
	  System.out.println(i);//4
  }
  for(int i=a1.length-1; i>=0;i--) {
	  System.out.println("Arrays negative loop="+a1[i]);//5
  }
  for(int i=a1.length-2;i>=0;i--) {
	  System.out.println("negativ statr from=" +a1[i]);//1
  }
  System.out.println("Max Number=" + Arrays.stream(a1).max().getAsInt());//2
  System.out.println("Min Number="  + Arrays.stream(a1).min().getAsInt());//3
  System.out.println("zero Position="  +a1[0]);//4
  System.out.println("last Position="  +a1[3]);//5
  System.out.println(a1.length -1);// total position
  String[] name = {"Sarower,Val"};
  System.out.println(Arrays.toString(name));
  Arrays.sort(a);
  System.out.println("this is Arrays sort=" +Arrays.toString(a));
   
  
  
  
  //list how to declare list? and printout list 10,20,30,5,30,10
    List<Integer> mylist =new ArrayList<>();
    //List<Integer>  mylist =new LinkedList<>();  
  // List<Integer>mylist =new Vector<>();  
  //List<Integer>  mylist =new Stack<>();  
      mylist.add(10);
     mylist.add(20);
     mylist.add(30);
     mylist.add(5);
     mylist.add(30);
     mylist.add(10);
   System.out.println("this is list=" +mylist);// how to clear duplicate from list by use set?
    Set<Integer> myset = new HashSet<>(mylist);
   System.out.println("list value without duplicate="  +myset);
   // how to change asc order fom list by use set?
    
   
   // Set<Integer> myTreeSet = new TreeSet<>();
    // System.out.println("List asc order="  +myTreeSet);
    
   
   
   System.out.println("list max number is=" +Collections.max(mylist));
     System.out.println("list min number is=" +Collections.min(mylist));
     Collections.sort(mylist);
     System.out.println("list Asc order is="  +mylist);
     Collections.reverse(mylist);
     System.out.println("list Dese order is=" +mylist);
    System.out.println();
     for(int i=0; i<mylist.size(); ++i) { //for loop list
     System.out.println(mylist.get(i));
     }
     List<String> list = new ArrayList<>();
     list.add("Sarower");
     list.add("Ahmed");
     list.add("5000");	
     list.add("30");
     System.out.println("List value=" +list);
  
  // how to clear duplicate from list?
      
  
 
 }
}