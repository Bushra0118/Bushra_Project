package com.practice.array;

import java.util.Arrays;

public class ArrayTasting4620 {



public static void main(String[] args) {
	
	
         //  new way
   int[] a= {10,20,30};//single dimetion
System.out.println(Arrays.toString(a));
   int[][] b= {{10,20},{30,40}};//two or multi
   
     String [] name = {"sarower","val"};

//old way

int[] a1= new int[3];
a1[0]=10;
a1[1]=20;
a1[2]=30;
for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
}
 int []s = {11,22,33,44,55,66,77};
System.out.println(Arrays.toString(s));
 for(int i=0;i<s.length;i++) {
System.out.println(s[i]);

}
 for(int i :s) {
System.out.println(i);	

}

    int[] u = {88,66,55,33,44,22,11};//5
    int[] v= {333,666,555,1000,333,444,222,111,222,};//8
  //Arrays.stream(a).max().getAsInt()
    //System.out.println("max number is="+Arrays.stream(u).max().getAsInt());
     // System.out.println("min number is="+Arrays.stream(u).min().getAsInt());
    
    int[] c = new int[u.length+v.length];//old way
System.out.println(Arrays.toString(c));
 for(int i =0;i<u.length; i++) {
c[i]=u[i];
 }
 System.out.println(Arrays.toString(c));

for(int i=0; i<v.length; i++) {
c[u.length+i]=v[i];
}
System.out.println(Arrays.toString(c));









}
 
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 