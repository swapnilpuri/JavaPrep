package com.iks.algo;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		int a[] = {34,23,64,11,84,78, 23, 78};
		int temp = 0;
		for (int i=(a.length-1); i >= 0; i--) {
			
			System.out.println(i);
			
			for (int j=i-1; j >= 0; j--) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				System.out.println("i="+a[i]+"*"+Arrays.toString(a));
				
			}
			System.out.println(Arrays.toString(a));
			
		}
		System.out.println("=====================================");
		System.out.println(Arrays.toString(a));
		System.out.println("=====================================");

	}

}
