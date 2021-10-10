package com.ik.recursion;

public class SumOfArray {
	
	public int sumOfArray(int[] a, int len) {
		if(len == 0) {
			return 0;
		}
		return a[len - 1] + sumOfArray(a, len -1);
		
	}

	public static void main(String[] args) {
		int[] a = {34, 67, 21, 22};
		SumOfArray sumOfArray = new SumOfArray();
		int sum = sumOfArray.sumOfArray(a, a.length);
		
		System.out.println(sum);

	}

}
