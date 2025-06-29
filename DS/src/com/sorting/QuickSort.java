package com.sorting;

public class QuickSort {
	
	private int[] arr;

	public QuickSort(int[] arr) {
		this.arr = arr;
	}
	
	/*
	 * arr = {5,7,2,3,12,0}
	 * pivot -> arr[0]
	 * 
	 */
	
	public int placeThePivotAtCorrectSpot(int l, int r) {
		int i = l;
		int j = r;
		if(l<r) {
			
			while(i<j) {
				while(i<=r && arr[i] <= arr[l]) {
					i++;
				}
				
				while(j>=0 && arr[j] > arr[l]) {
					j--;
				}
				
				if(i<j) {
					swap(i, j);
				}
			
			}
			swap(l, j);
			r = j;
		}
		
		return j;
	}
	
	public void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
	}

	public void sort(int l, int r){
		if(l<r) {
			int pivot = placeThePivotAtCorrectSpot(l, r);
			sort(l, pivot-1);
			sort(pivot+1, r);
		}
	}
	
	

}
