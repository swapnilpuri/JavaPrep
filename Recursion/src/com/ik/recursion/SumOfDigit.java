package com.ik.recursion;

public class SumOfDigit {
	
	public int sumOfDigit(int n) {
		if (n==0) {
			return 0;
		}else {
			return n%10 + sumOfDigit(n/10 );
		}
		
	}

	public static void main(String[] args) {
		int n = 3356;
		SumOfDigit sum = new SumOfDigit();
		int s = sum.sumOfDigit(n);
		System.out.println(s);
	}

}
