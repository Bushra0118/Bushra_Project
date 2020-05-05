package com.practice.list;

    import java.util.HashMap;
	import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
	import java.util.Map;
	import java.util.Set;
	import java.util.TreeMap;
	import java.util.TreeSet;
	
	public class MyMapPractice {
		
	public static void main(String[] args) {
			
		
	     int a=10;// variable can handle only one value at a time
	     int[] b= {10,20};//array fixed length
	   //VAR and array== primitive and non primitive(int,double,boolean, String)
	     //List/set/map== Integer, Double,Boolean,String== wrapper class
	   // List obj = new ArrayList();//it over come array problem
	     

	// Set<Integer> myset= new HashSet<>();
	// Set<Integer> myset2= new LinkedHashSet<>();
	// Set<Integer> myset3= new TreeSet<>();
		
	 Set<Integer> mySet = new HashSet<>();//remove doublicate from set
		int [] myArray = {2,3,4,5,6,4,5};
		for(int i=0; i< myArray.length ; i++) {
			mySet.add(myArray[i]);			
			}		
		System.out.println(mySet);			

	 Map<String,String> MyMap = new TreeMap<>();
	 MyMap.put("name","Rajon");
	 MyMap.put("age","30");
	 MyMap.put("join date","6/20/19");
	 MyMap.put("phone","7187390200");
	System.out.println(MyMap);
	System.out.println(MyMap.keySet());
	System.out.println(MyMap.values());
	//System.out.println(MyMap.get());

	//sky= blue, sun = red, tree=green.. declare map and print 
	//print ... key
	//print.... value
	  
	//Map<String,String> myMap = new HashMap<>();
	 // myMap.put("sky", "blue");
	 // myMap.put("sun", "red");
	 // myMap.put("tree", "green");
	 // System.out.println(myMap);
	//  System.out.println(myMap.keySet());
	//  System.out.println(myMap.values());
	 // System.out.println(myMap.get("tree"));
	 

	Map<String,Double> myMap1 = new HashMap<>();
	 // myMap1.put("Milk", 3.99);
	 // myMap1.put("egg", 2.15);
	 // myMap1.put("meet", 4.99);
	 // myMap1.put("Milk", 3.99); 
	  System.out.println(myMap1.keySet());
	  System.out.println(myMap1.values());
	  System.out.println(myMap1.get("meet"));
	  
	 // myMap1.put("Milk", 3.99); //found duplicate
	//  myMap1.put("egg", 2.15);
	//  myMap1.put("meet", 4.99);
	//  myMap1.put("Milk", 3.99); 
	  
	  
	  
	  // myMap1.put("Milk", 3.99); //found null
	 //  myMap1.put("egg", 2.15);
	 //  myMap1.put("meet", 4.99);
	  // myMap1.put("Milk", 3.99); 
	   
	   
	   
	   
	   
	   //how to loop a map
	   myMap1.put("Milk", 3.99); //found null
	   myMap1.put("egg", 2.15);
	   myMap1.put("meet", 4.99);
	   myMap1.put("Milk", 3.99); 
	   System.out.println(myMap1.entrySet());
	 
	   myMap1.forEach((k,v) ->{       //each for loop
		   System.out.println(k+" ="+v);
	    System.out.println(k );
	    System.out.println(v );
	   });
	   myMap1.entrySet() .forEach(item ->{
		   System.out.println(item);
		   System.out.println(item.getKey());
		   System.out.println(item.getValue());
		   
		   
	   });
	 //  Code to check above table:
		   Map<String ,Double> myMap = new Hashtable<>();
		   		myMap.put("Milk", null);
		   		myMap.put("Meat", 7.99);
		   		myMap.put("Fish", 7.99);
   System.out.println(myMap.keySet());

   System.out.println(myMap.entrySet());
	   
	   
	   
	 }
	

	}
