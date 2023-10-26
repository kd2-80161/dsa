package com.sunbeam;

public class Compare {
	public static void linearSearch(int[] arr, int key) {
		int cnt = 0;
		int sum=0;
		
		for (int value : arr) {
			sum+=cnt++;
			if (value == key) {
				System.out.println("Value found");
				System.out.println("Total no of comparisons are "+sum);
				break;
			
			}

		}
	}

	public static void binarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length-1;
		int mid;
		int cnt = 0;
		int sum=0;
		
		while (left <= right) {
			
			mid = (left + right) / 2;
			
			sum=sum+(cnt++);
			
			if (arr[mid] == key) {
				System.out.println("value found at " + mid);
				System.out.println("Total no of comparisons are "+sum);
				break;
			} else if (arr[mid] < key)
				left = mid + 1;
			else
				right = mid - 1;
			

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 13, 41, 455, 666, 4, 3 };
		
		int[] arr1 = { 11, 22, 33, 44, 55, 66, 77 };
		
		linearSearch(arr, 13);
		binarySearch(arr1, 11);
		

	}

}
