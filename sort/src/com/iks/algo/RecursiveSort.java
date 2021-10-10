package com.iks.algo;

public class RecursiveSort {

	public static void main(String[] args) {
		int a[] = {34,23,64,11,84,78, 23, 78};

	}
	
	private int[] sort(int[] b, int n) {
		
		if (n <= 1) return b;
		
		sort(b,n-1);
		
		return b;
		
	}

}
