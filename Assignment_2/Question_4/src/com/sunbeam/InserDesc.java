package com.sunbeam;

import java.util.Arrays;

public class InserDesc {

	public static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int revInsertionSort(int[] arr, int n) {
		int cnt = 0;
		for (int i = 0; i <= n - 1; i++) {
			int j = i;
			cnt++;
			while (j > 0 && arr[j] > arr[j - 1]) {
				swap(j, j - 1, arr);
				j--;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,4,2,5,2,6,1,0};
		
		System.out.println(Arrays.toString(arr));
		
		int cnt = revInsertionSort(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("No of comparison: "+cnt);
		
		
	}

}
