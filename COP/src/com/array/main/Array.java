package com.array.main;

public class Array {
	

	public static void main(String[] args) {
		
		int ar[]= {1,1,5,5,9,8};
		
		
		for (int i : ar) {
			System.out.print(" "+i);//print every element in array
		}
		
		int j=0;
		for(int i =0;i<ar.length-1;i++) {
			if (ar[i] != ar[i+1]) {
				ar[j++] = ar[i];
			}
		}
		ar[j++] = ar[ar.length-1];
		
		System.out.println("after removing duplicate values:");
		for(int i=0; i<j;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

}
