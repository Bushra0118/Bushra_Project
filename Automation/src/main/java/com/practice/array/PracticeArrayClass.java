package com.practice.array;

import java.util.Arrays;

public class PracticeArrayClass {
   public static void main(String[] args) {
	

	int[]a= {3,20,30,40,50,60,777};//1,loop it
	                               //2,zero position
                                     //3,last position
   for(int i:a) {                  //4,without loop
                                    //5,find out max num
  System.out.println(i);       //1        //6,findout min num
   }  
   System.out.println(a[0]);
   
   System.out.println(a[a.length-1]);
   
   System.out.println(Arrays.toString(a));
  
   //java 8==>Stream API & lambda expression
   //Arrays.stream(a).max().getAsInt()
   System.out.println("max number is="+Arrays.stream(a).max().getAsInt());
   
   //Array.stream(a).min().getAsInt()
   System.out.println("min Number is="+Arrays.stream(a).min().getAsInt());
   
   
   
   
   
   
   
   
   
   }
}