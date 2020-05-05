package com.automation;

public class WhileLoopDemo {
    
public static void main(String[] args) {
	

		
	
	String s="United State Of America";
	
	//how many ee's is there
    for(int i=0;i<s.length(); i++) {
	if(s.charAt(i)=='e') {
   System.out.println(s.charAt(i));
	
	}
	
    }
	//find out the word mom is pallimdrom or no
	String deb="MOM";
	StringBuilder obj= new StringBuilder(deb);
	if(deb.equals(obj.reverse().toString())){
	System.out.println("This is a pallimdrom");
	}
    else {	
	System.out.println("not a pallimdrom");
	}
	
	String a ="10,442.75$";

	System.out.println(a.replace(",","").replace("$",""));
	
	
	}
}