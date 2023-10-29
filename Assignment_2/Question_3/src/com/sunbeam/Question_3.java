package com.sunbeam;

import java.util.Arrays;

public class Question_3 {

	static void swap(int i,int j,int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}
	
	static int insertion_sort(int[] arr, int n) {
		int cnt=0;
	   	for(int i=0;i<=n-1;i++) {
	   		int j=i;
	   		cnt++;
	   		while(j>0 && arr[j]<arr[j-1]) {
	   			swap(j,j-1,arr);
	   			j--;
	   		}
	   	}
	   	return cnt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,5,4,3,2,1,8};
		int n = arr.length;
		
	    System.out.println(Arrays.toString(arr));
		int cnt = insertion_sort(arr,n);
		System.out.println(Arrays.toString(arr));
		System.out.println("No of comparison "+cnt);
		
	}

}
