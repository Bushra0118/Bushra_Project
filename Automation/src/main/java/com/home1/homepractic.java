     package com.home1;
    
     
  public class homepractic {
    
	  int b = 20;//gobal instance vari
      int c ;
 
     
     
     public void getsalary(){
      int a =10;//local
      int c = a+b;
  System.out.println(c);
   }
  
  
 public static void main(String[] args) {
    homepractic obj = new homepractic();
      obj.getsalary();
 
 }
      
  }  
      
      
      
      
        
       
     
    
      
      
      
    
