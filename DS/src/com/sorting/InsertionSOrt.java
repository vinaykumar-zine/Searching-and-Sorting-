package com.sorting;

public class InsertionSOrt {

private int[] arr;
	
	public InsertionSOrt(int[] arr) {
		this.arr = arr;
	}
	
	//arr[5] = {2,7,5,3,12};
	public void sort() {
		
		for(int ptr = 1; ptr<arr.length;ptr++) {
			int key = arr[ptr];
			int j = ptr-1;
			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
	}
	
}
