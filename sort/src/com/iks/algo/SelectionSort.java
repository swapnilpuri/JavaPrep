package com.iks.algo;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {34,23,64,11,84,78, 23, 78};
		int b[] = new int[a.length];
		b[0] = a[0];
		int temp;
		for (int i=0; i < a.length; i++) {
			for (int j=i+1; j < a.length; j++) {

				if(a[i] > a[j] ) {	
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
				System.out.print("\n j="+j);
				for(int k=0; k < a.length ; k++) {
					System.out.print(" " + a[k]);
				}
				System.out.print("\n*******************\n");

			}
			
			System.out.print("\ni =" + i + "\n");
			
			for(int k=0; k < a.length ; k++) {
				System.out.print(" " + a[k]);
			}
			
			System.out.print("\n");
			
			
		}
		

		
		
		
		

	}

}
