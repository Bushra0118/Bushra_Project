package com.practice.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassListTesting {


public static void main(String[] args) {
	
	
//10,20,30,40
  List<Integer> list= new ArrayList<>();
  list.add(10);
  list.add(20);
  list.add(30);
  list.add(40);
  System.out.println(list);
for(int i=0; i<list.size();i++) {
	System.out.println(list.get(i));
}
//max number=Collections.max(list);
System.out.println("max number is="+Collections.max(list));

//min number=Collections.min(list);
System.out.println("min number is="+Collections.min(list));

Collections.sort(list);
System.out.println("Asc order is=" +list);
Collections.reverse(list);
System.out.println("Dese order is="+list);


List<String> MyList= new ArrayList<>();
MyList.add("Sarower");
MyList.add("Sarower");
MyList.add("Ahmed");
System.out.println("List Value="+MyList);
Set<String> MySet= new HashSet<>();

//List<Integer> list= new ArrayList<>();
list.add(100);
list.add(200);
list.add(300);
list.add(400);
System.out.println("List value=" +list);

Set<Integer>set = new HashSet<>();

set.add(10);
set.add(20);
set.add(30);
set.add(40);
System.out.println("hashset value=" +set);
//<Integer>set = new LinkHashSet<>();



}
}