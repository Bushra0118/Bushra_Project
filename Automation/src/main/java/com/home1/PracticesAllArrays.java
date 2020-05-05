package com.home1;

import java.util.Arrays;

public class PracticesAllArrays {

	public static void main(String[] args) {
	 
		//Arrays how to declare Arrays?
		
		int[] a1 = {10,20,30,40};//new way
		System.out.println(a1);
	int[] a= new int[4];
		a[0] =10;          // old way
		a[1]=20;
		a[2]=30;
		a[3]=40;
		 
	System.out.println(Arrays.toString(a)); // for basic loop
		
	for(int i=0;i<a.length; i++){
	System.out.println("Arrays for loop=" +a[i]);  // for loop
	System.out.println("Arrays length=" +a.length);// Arrays lenght =4
		 }
	for(int i :  a) {
	System.out.println("Arrays new loop=" +i);	//for loop advance or enhance loop
	}
	for(int i=a1.length-1;i>=0; i--) {
		System.out.println("Arrays negative loop=" +a1[i]);//Arrays negative loop
	//}
	//for(int i=a.length-1;i>0; i--) {
	System.out.println("Arrays second position=" +a1[i]);
	
	System.out.println("Arrays Zero POsition="  +a1[i]);
	}
	
	}
}


