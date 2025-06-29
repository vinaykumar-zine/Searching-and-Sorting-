package com.sorting;

public class BubbleSOrt {
private int[] arr;
	
	public BubbleSOrt(int[] arr) {
		this.arr = arr;
	}
	
	//arr[5] = {5,7,2,3,12} => ans = {2,3,5,7,12}
	
	/*
	 * 1st step => create a pointer and place it on 1 index
	 * 
	 * arr[5] = {5,7,2,3,12}
	 * 			{5,7,2,3,12}
	 * 			     ^
	 * 			{5,2,7,3,12}
	 * 				   ^
	 * 			{5,2,3,7,12}
	 * 				     ^
	 * 			{2,3,5,7,12}
	 * 				      
	 * 
	 * 
	 */
	
	
	public void sort() {
		for(int i=0;i<arr.length;i++) {
			for(int j=1; j<arr.length;j++) {
				if(arr[j]<arr[j-1]) {
					swap(j, j-1);
				}
			}
		}
	}
	
	
	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

}
