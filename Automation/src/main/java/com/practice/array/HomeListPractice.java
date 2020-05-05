package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeListPractice {  
	
 public static void main(String[] args) {
	
 int[] a = {10,20,30};
for(int i=0;i<a.length;i++ ) {
	 System.out.println(a[i]);//print Arrays by for loop
 }
//max and min number find out
 System.out.println("This is Array max number="+Arrays.stream(a).max().getAsInt());
 System.out.println("This is Array min number="+Arrays.stream(a).min().getAsInt());

System.out.println(a[a.length-1]);//Arrays last number

List<Integer> list =new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
System.out.println(list);
System.out.println("This is list max number="+Collections.max(list));

System.out.println("This is list min number="+Collections.min(list));

System.out.println(list.get(list.size()-1));//list last value

}




}
