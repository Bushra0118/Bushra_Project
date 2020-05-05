package com.usa;

import java.util.Arrays;

public class HomeArraysAllPractice {

	
	int[] a = {1,2,3,4,5,6,7};
	
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,};
		System.out.println(Arrays.toString(a));
		//write an Arrya 0,1,2,3,4,5,6,7
		//int[] a = new int[5];// new Arrays
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=50;
		 System.out.println(Arrays.toString(a));//print Array
		 System.out.println(a[0]);//zero position
		 System.out.println("Index Number=" +a[4]);//index num
		 System.out.println(a[a.length-1]);//last position
		 System.out.println("My max num=" +Arrays.stream(a).max().getAsInt());
		 System.out.println("My min num =" +Arrays.stream(a).min().getAsInt());
		
			 for(int i=0; i<a.length; i++) {// loop Array
		  System.out.println(a[i]);
			}
	
		  int[] MyArray= {11,22,33,44};//Arrays advence for loop
		  for(int i:MyArray) {
		  System.out.println(i);
	}
	      int[] s= {5,10,15,20};
	
	      for(int i  :s) {
          System.out.println(i);
	}

	
	
	}
		  
}
