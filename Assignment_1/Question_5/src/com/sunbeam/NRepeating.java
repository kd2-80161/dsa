package com.sunbeam;

public class NRepeating {
	
	public static int nonRepeating(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int flag=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=1;
					break;
				}
			}
			if(flag==1)
			count++;
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		System.out.println(nonRepeating(arr));
		
	}

}
