package com.practice.array;

public class TestingArrayHome {

public static void main(String[] args) {
	
	int[] a= {10,20,30,40,50,60,70,80,90,100};//num is 10 and index is 9
	//zero position = a[0]
	//last position= index 9=(total position-1)==>a[a.lenght-1]
	
	for(int i:a) {//new way
	System.out.println(i);
	
	//System.out.println(a[0]);
	
	System.out.println(a[a.length-1]);
	
	}
	
}



}
