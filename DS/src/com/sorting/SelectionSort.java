package com.sorting;

public class SelectionSort {

	private int[] arr;
	
	public SelectionSort(int[] arr) {
		this.arr = arr;
	}
	
	//arr[5] = {2,7,5,3,12} => ans = {2,3,5,7,12}
	/*
	 *	{2,3,5,7,12} 
	 *	       ^
	 */
	
	public void sort(){
		
		for(int i=0;i<arr.length;i++) {
//			 int tmp = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[i])
				{
					swap(i, j);
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
