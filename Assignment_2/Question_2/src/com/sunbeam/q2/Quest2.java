package com.sunbeam.q2;

import java.util.Arrays;
import java.util.Iterator;

public class Quest2 {
	public static void swap(int i,int j,int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	
	public static int bubblesort(int[]arr) {
		int size = arr.length;
		int cnt = 0;
		for(int i=0;i< size-1;i++) {
			for (int j = 0; j < size-1-i; j++) {
				cnt++;
				if(arr[j]>arr[j+1]) {
					swap(j,j+1,arr);
				}
			}
		}
		return cnt;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {33, 22, 66, 55, 44, 11};
		System.out.println(Arrays.toString(arr));
		int cnt = bubblesort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("No of comparision "+cnt);
	}

}
