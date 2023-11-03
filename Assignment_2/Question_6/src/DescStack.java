import java.util.Scanner;

public class DescStack {
	
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		inputArray(arr);
		int top = arr.length-1;
		int value = new Scanner(System.in).nextInt();
		top--;
	    push(value,arr,top);
	    pop(top);
	    
	}

	private static void pop(int top) {
		// TODO Auto-generated method stub
		
	}

	private static void push(int value,int[] arr,int top) {
		// TODO Auto-generated method stub
		arr[top] = value;
	}

	private static void inputArray(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
	}
}
