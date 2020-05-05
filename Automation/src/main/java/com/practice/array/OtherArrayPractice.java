package com.practice.array;

import java.util.Arrays;

public class OtherArrayPractice {

public static void main(String[] args) {
	
  int[] a = {2,3,4,5,6,7,8};//7 == index 0 to 6
  int[] b= {7,8,9,10,20,30};//6==index 0 to 5

//Combined both array into a single array by coding
//2,3,4,5,6,7,8,9,10
  
 System.out.println(a.length);
 System.out.println(b.length);
 int[] c = new int [a.length+b.length]; //  13 num old 

 
    for(int i=0;i<a.length;i++) {//old way
    c[i]=a[i];

 }
   //System.out.println(Arrays.toString(c)); or
	System.out.println("This is my Array C and only copy a="+Arrays.toString(c));//old
	for(int i=0;i<b.length;i++) {//old way
	
	c[a.length+i]=b[i];
	}
	
	System.out.println("This is my Array c and only copy a & b="+Arrays.toString(c));
	
	
	//new way combined Arrays
	System.arraycopy(a, 0, c, 0,a.length);//new way

System.arraycopy(b, 0, c, a.length, b.length);

System.out.println(Arrays.toString(c));


//int[] c = new int [a.length+b.length]; //old 
}

}
