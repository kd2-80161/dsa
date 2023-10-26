package com.sunbeam;

import java.util.Scanner;

public class NthOccurance {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = Sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Sc.nextInt();
		}

		System.out.println("Enter the key");
		int key = Sc.nextInt();
		System.out.println("Enter the nth occurance");
		int nth = Sc.nextInt();
		int cnt = 0;
	}

	public static int linear_search(int arr[], int size, int key, int n) {
		int counter = 0;
		// traverse collection(array) from one end to another
		for (int i = 0; i < size; i++) {
			// compare each element of array with key
			if (arr[i] == key) {
				counter++;
				if (counter == n)
					return i;
			} // if both are equal, then stop
				// if both are not equal, continue
		}
		// if key is not found
		return -1;
	}

}
