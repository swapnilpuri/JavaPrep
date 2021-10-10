package com.ik.ds;

import java.util.Stack;

public class StackExmp {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		
		for (int i=0; i <=10; i++) {
			stk.add(i);
			stk.push(i);			
		}
		stk.push(46);
		System.out.println(stk.search(10));
		System.out.println("Size:"+stk.size());
		stk.forEach(S -> System.out.println(S));
		
		stk.pop();
		
		System.out.println("================");
		stk.iterator().forEachRemaining(System.out::println);
		
		

	}
	

}
