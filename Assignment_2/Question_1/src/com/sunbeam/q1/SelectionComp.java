package com.sunbeam.q1;

import java.util.Arrays;

public class SelectionComp {
	
	public static int selectionsort(int[] arr) {
		int n = arr.length;
		int cnt=0;
		for (int i = 0; i < n-1; i++) {
			for(int j=i+1;j<n;j++) {
				cnt++;
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {44, 11, 55, 22, 66, 33};
		System.out.println(Arrays.toString(arr));
		int cnt=selectionsort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("No of comparison is "+cnt);

	}

}
