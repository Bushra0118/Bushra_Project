package com.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestingSet {

	
	public static void main(String[] args) {
	
	 

 TestingSet obj = new TestingSet();
	 // Interface obj= newinterface();//2 interface no possipol
	 //interface obj =new hashSet(); possible
	 
	 Set<Integer> myset  = new HashSet<>();//no duplicat one null
	 myset.add(null);
	 myset.add(2);
	 myset.add(2);
	 myset.add(3);
	 myset.add(4);
	 myset.add(null);
	 
	 System.out.println(myset);
	 
	 //2,3,4,5 int = veriable & Array or Integer=list/set/map
	 // int a = {2,3,4,5};
	 Set<Integer> myLinkedset  = new LinkedHashSet<>();//inserson order no duplicate one null
	 myLinkedset.add(4);
	 myLinkedset.add(2);
	 myLinkedset.add(2);
	 myLinkedset.add(3);
	 myLinkedset.add(null);
	 myLinkedset.add(null);
	 
	 System.out.println(myLinkedset);
	 
	 Set<Integer> myTreeset  = new TreeSet<>();//no null==no duplicate==insertion order
	 myTreeset.add(4);
	 myTreeset.add(2);
	 myTreeset.add(2);
	 myTreeset.add(3);
	  
	 System.out.println(myTreeset);
  
	  
	  Set<Integer> mySet = new HashSet<>();


 
 System.out.println(myLinkedset);
 
 
 //how to remove duplicate
 Set<Integer> MySet = new TreeSet<>();//out side Loop
MySet.add(2);
MySet.add(3);
MySet.add(5);
MySet.add(2);
MySet.add(3);

 int [] a = {2,3,4,5,6,2,3,3,3};
 //System.out.println(Arrays.toString(a));
 
 for(int i=0;i<a.length; i++) { 
	 
System.out.println(a[i]);
 
 }
 
 System.out.println(MySet);

// 4,4,3,3,null null//remove duplicate and null
 
    List<Integer> list =new ArrayList<>();
      list.add(4);
      list.add(4);
      list.add(3);
      list.add(3);
      list.add(null);
      list.add(null);
     System.out.println();
 
 
	
	}
 
}
 
 



