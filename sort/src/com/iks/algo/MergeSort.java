package com.iks.algo;

import java.util.Arrays;

public class MergeSort {
	
	void merge(int[] b, int start, int mid, int end) {
		System.out.println("===============================");
		System.out.println("Input b"+Arrays.toString(b));
		System.out.println("start:"+start+"; mid:"+mid+"; end:"+end);
		
		int lLength  = mid - start + 1;
		int rLength  = end - mid;
		int[] left = new int[lLength]; 
		int[] right = new int[rLength]; 
		
		System.out.println("Left b"+Arrays.toString(left));
		for(int i=0; i< lLength; i++) {
			left[i] = b[start + i];
		}
		
		for(int j=0; j< rLength; j++) {
			right[j] = b[mid+1 + j];
		}
		
		System.out.println("Right b"+Arrays.toString(right));
		
		int i=0,j = 0,k = start;
		
		while(i < lLength && j < rLength) {
			if(left[i] < right[j]) {
				b[k] = left[i];
				i++;
			}else {
				b[k] = right[j];
				j++;
			}
			k++;
		}
		
		System.out.println("i:"+i+";mid:"+mid);
		System.out.println("Sorted b"+Arrays.toString(b));
		
		//Copy remaining of left
		while(i < lLength) {
			b[k] = left[i];
			i++;
			k++;
		}
		
		// Copy remaining of right
		while(j < rLength) {
			b[k] = right[j];
			k++;
			j++;
		}
		
		System.out.println("===============================");
		
	}
	
	void sort(int[] a, int start, int end) {
		
		if (start < end) {
			int mid = (start+end)/2;
			System.out.println("**start:"+start+";mid:"+mid+";end:"+end);
			sort(a,start,mid);
			sort(a,mid+1,end);
			
			merge(a, start,mid,end);
		}
		
		
	}

	public static void main(String[] args) {
		int[] arr  = {45,34,65,3,56,10,22};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

}
