package com.sunbeam;

public class DescBinary {
	public static void BinarySearch(int[] arr, int key) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while (left <= right) {
			int sum = left + right;
			mid = sum / 2;
			if (arr[mid] == key) {
				System.out.println("Value Found");
				break;
			} else if (key > arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 99, 98, 97, 96, 95, 94, 93, 92, 91 };
		BinarySearch(arr, 96);
	}
}
