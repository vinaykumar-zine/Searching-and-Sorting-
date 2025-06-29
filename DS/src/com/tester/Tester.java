package com.tester;

import com.linkedlist.LinkedList;
import com.searching.BinarySearch;
import com.searching.LinearSearch;
import com.sorting.BubbleSOrt;
import com.sorting.InsertionSOrt;
import com.sorting.MergeSort;
import com.sorting.QuickSort;
import com.sorting.SelectionSort;

public class Tester {
	
	public static void main(String[] args) {
		int[] arr = {5,7,2,3,12,0};
//		int[]  arr = {2,3,5,7,12};
		
//		LinearSearch ls = new LinearSearch(arr);
//		System.out.println(ls.find(12));
		
//		BinarySearch bs = new BinarySearch(arr);
//		System.out.println(bs.find(24));
		
//		BubbleSOrt bs = new BubbleSOrt(arr);
//		bs.sort();
		
//		SelectionSort is = new SelectionSort(arr);
//		is.sort();
		
//		InsertionSOrt is = new InsertionSOrt(arr);
//		is.sort();
		
//		QuickSort qs = new QuickSort(arr);
//		qs.sort(0, arr.length-1);
		
//		qs.swap(0, arr.length-1);
		
		MergeSort ms = new MergeSort(arr);
		ms.sort();
		
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
//		int a = 10;
//		int b = 20;
//		Integer x = new Integer(a);
//		Integer y = new Integer(b);
//		System.out.println("a: "+a+" b: "+b);
		
//		LinkedList ll = new LinkedList();
//		ll.addElem(12);
//		ll.addElem(24);
//		ll.addElem(7);
//		ll.addElem(2);
//		ll.addElem(20);
//		ll.addElem(69);
//		
//		ll.printList();
//		ll.printRevList();		
	}
	

}

