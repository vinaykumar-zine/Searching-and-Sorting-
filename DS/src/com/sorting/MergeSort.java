package com.sorting;

public class MergeSort {

    private int[] arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        mergeSort(0, arr.length - 1);
    }

    private void mergeSort(int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;
        mergeSort(l, mid);
        mergeSort(mid + 1, r);
        mergeArr(l, mid, r);
    }

    private void mergeArr(int l, int mid, int r) {
        int[] tmp = new int[r - l + 1];
        int left = l;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= r) {
            if (arr[left] <= arr[right]) {
                tmp[k++] = arr[left++];
            } else {
                tmp[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            tmp[k++] = arr[left++];
        }

        while (right <= r) {
            tmp[k++] = arr[right++];
        }

        
        for (int i = 0; i < tmp.length; i++) {
            arr[l + i] = tmp[i];
        }
    }

    
}
