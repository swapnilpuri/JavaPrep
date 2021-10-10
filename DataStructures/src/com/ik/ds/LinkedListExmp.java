package com.ik.ds;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExmp {

	public static void main(String[] args) {
		 
			  
			  LinkedList<String> al=new LinkedList<String>();  
			  al.add("Ravi");  
			  al.add("Vijay");  
			  al.add("Ravi");  
			  al.add("Ajay");  
			  
			  Iterator<String> itr=al.iterator();  
			  while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  }  
			  
			  al.push("Pushed");
			  al.addFirst("Add First");
			  al.addFirst("ADD First 2");
			  
			  System.out.println("al"+al);
			  al.removeLast();
			  System.out.println("al"+al);
			  
			 }  
	
	
	

}
