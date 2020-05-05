package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;

public class TastingArray {

	public static void main(String[] args) {
		int a=10;//a is a variable
	    int[] b= {10,20,30};//b is a array
	   System.out.println(Arrays.toString(b));//new way

	  int[] myArrays = new int[4];//1st[] = array sing,2nd[]= how many number you will put inside or number theory

	  myArrays[0]=10;//index theory
	  myArrays[1]=20;
	  myArrays[2]=30;
	 myArrays[3]=40;
	  for(int i=0; i<myArrays.length; i++) {//besic for loop

	  System.out.println(myArrays[i]);
	  }

	  for(int i:myArrays) {//advance for loop or enhance for loop

	  System.out.println(i);
	  }

	  System.out.println(myArrays.toString());
	  System.out.println("Index number="+myArrays[2]);// 4 will give=ArrayindexoutofBoundaryException
	  
	  
	}





	}


