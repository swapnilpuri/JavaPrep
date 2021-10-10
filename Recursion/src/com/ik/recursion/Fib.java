package com.ik.recursion;

import java.util.HashMap;

public class Fib {
	int result = 0;
	HashMap<Integer, Integer> memoMap = new HashMap<>();
	int calFib(int nthTerm) {
		
		//if (nthTerm == 0 || nthTerm == 2) {
		if (nthTerm == 0 || nthTerm == 1) {
			return nthTerm;
		}
		System.out.println("nthTerm:"+nthTerm);
		if(memoMap.get(Integer.valueOf(nthTerm)) != null) {
			return memoMap.get(Integer.valueOf(nthTerm));
		}
		int n1 = calFib(nthTerm - 1);
		int n2 = calFib(nthTerm - 2);
		result =  n1 + n2;
		memoMap.put(Integer.valueOf(nthTerm), Integer.valueOf(result));
		System.out.println("nthTerm:"+nthTerm+"     "+n1+" + "+n2+"");
		return result;
		
		
	}
	
	//try sequential approach (Bottom-up approach)

	public static void main(String[] args) {
		Fib fib = new Fib();
		int answer = fib.calFib(10);
		
		System.out.println("\n"+answer);

	}

}
