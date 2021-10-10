package com.ik.sort;

import java.util.Arrays;

public class OddEven {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		
		int oddIndex = a.length-1;      //Reverse pointer for swaping with odd numbers only
		
		X:for (int i=0; i < a.length; i++) {
			if(a[i]%2==1) {
				for (int j=oddIndex; j >= 0; j--) { // Check to swapn with even pointers only
					if(a[j]%2==0) {					
						oddIndex = j-1;
						swap(a, i,j);
						continue X;
					}
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(a));

	}
	
	public static void swap( int[] b, int indexi, int indexj) {
		int temp = b[indexj];
		b[indexj] = b[indexi];
		b[indexi] = temp;
	}

}
