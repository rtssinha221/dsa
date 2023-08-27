package Array;

import java.util.*;

public class Insertion {
	
	static void insertEnd(int[] arr, int num) {
		int i=0;
		while(arr[i]!= 0) i++;
		arr[i] = num;
	}
	
	static void insertMid(int[] arr, int idx, int num) {
		
		int end = arr.length-1;
		
		while(end > idx) {
			arr[end] = arr[end-1];
			end--;
		}
		arr[idx] = num;
	}
	
	public static void main(String args[]) {
		
		int[] arr = new int[5];
		insertEnd(arr, 1);
		insertEnd(arr, 2);
		insertEnd(arr, 3);
		insertEnd(arr, 4);
		System.out.println(Arrays.toString(arr));
		insertMid(arr, 2, 10);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
