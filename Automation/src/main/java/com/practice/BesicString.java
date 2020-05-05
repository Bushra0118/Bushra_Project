package com.practice;

public class BesicString {


public static void main(String[] args) {
	
String name = new String("Bushra");
	String lastname = "chowdhury";
   name.concat(lastname);
	String Full = name.concat(lastname).concat("Steve");
   
   System.out.println(name);
	System.out.println(Full);
  
	StringBuffer obj = new StringBuffer("Bushra");
    obj.append( lastname);
    System.out.println(obj);
   
    StringBuilder obj1 =new StringBuilder("Zia");
    obj1.append("Rajon").append("Steve and alex").append( "val");
System.out.println(obj1);




}

}
