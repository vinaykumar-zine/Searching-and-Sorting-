package com.searching;

public class LinearSearch {
	private int[] arr;
	public LinearSearch(int[] arr) {
		this.arr = arr;
	}
	
	//arr[5] = {5,7,2,3,12}
	public boolean find(int elem) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == elem) return true;
		}
		
		return false;
	}
	

}
