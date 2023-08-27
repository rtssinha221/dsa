package Array;

import java.util.*;

public class Rotate {
	
	public static void main(String args[]) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(arr));
//		rotate1(arr, 3);
		rotate2(arr, 2);
		System.out.println(Arrays.toString(arr));
	}
	
	static void rotate2(int[] arr, int d) {
		
		int len = arr.length;
		int[] temp = new int[d];
		int tempIdx = 0;
		for(int i=len-d; i<len; i++) {
			temp[tempIdx++] = arr[i]; 
		}
		
		int end = len-1;
		while(end-d >= 0) {
			arr[end] = arr[end-d];
			end = end - 1;
		}
		
		
		for(int i=0; i<=end; i++) arr[i] = temp[i];
	}
	
	static void rotate1(int[] arr, int d) {
		
		int len = arr.length-1;
		reverse(arr, 0, len-d);
		reverse(arr, len-d+1, len);
		reverse(arr, 0, len);
	}
	
	static void reverse(int[] arr, int start, int end) {
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
