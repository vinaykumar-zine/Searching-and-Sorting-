package com.searching;

public class BinarySearch {
	
	private int[] arr;
	
	public BinarySearch(int[] arr) {
		this.arr = arr;
	}
	
	//prerequisite:=> the give array should be sorted!
	
	//arr[5] = {2,3,5,7,12} elem = 7
	/*			0 1 2 3 4
	 * take two pointers:=> left -> will point to leftmost element
	 * 					:=> right -> will point to rightmost element
	 * 					:=> mid -> it will point to mid of current left right
	 * 1st step => check if mid is equals to elem
	 * 2nd step => check if mid is less than elem => left = mid + 1;
	 * 3rd step => check if mid is greater than elem => right = mid - 1;
	 */
	
	public boolean find(int elem) {
		int left = 0;
		int right = arr.length - 1;
		int mid; 
		while(left<=right) {
			mid = (left+right)/2;
			System.out.println("mid: "+mid);
			if(arr[mid] == elem)return true;
			
			else if(arr[mid] < elem) left = mid + 1;
			else right = mid - 1;
		}
		return false;
	}

}
