package com.sunbeam;

public class EleRank {
	
	public static int rank(int[] arr,int value) {
		int cnt =0;
		for(int ele:arr) {
			
			if(ele== value)
				return cnt;
			cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Rank of 4 is: "+rank(arr,4));
	}

}
