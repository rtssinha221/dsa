package Array;
import java.util.*;

public class Rotation {
	
	public static void main(String args[]) {
		
		int[] arr = {1, 2, 3, 4 ,5, 6, 7};
		System.out.println(Arrays.toString(arr));
		
//		rotate(arr, 3);
//		rotate2(arr, 6);
		rotate3(arr, 6);
		System.out.println(Arrays.toString(arr));
	}
	
	static void rotate3(int[] arr, int d) {
		
		int[] temp = new int[d];
		for(int i=0; i<d; i++) {
			temp[i] = arr[i];
		}
		
		int i = d; 
		while(i< arr.length) {
			arr[i-d] = arr[i];
			i++;
		}
		
		int targetNum = arr.length - d;
		i = 0;
		while(targetNum < arr.length) {
			arr[targetNum] = temp[i];
			targetNum++;
			i++;
		}
		
	}
	
	
	static void rotate2(int[] arr, int d) {
		
		if(arr.length < d) {
			System.out.println("Can't rotate by "+d+" position");
			return;
		}
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		reverse(arr, 0, arr.length-1);
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
	
	static void rotate(int[] arr, int d) {
		
		if(arr.length < d) {
			System.out.println("Can't be rotated by "+d+" position");
			return;
		}
		
		for(int i=0; i<d; i++) {
			moveLeft(arr);
		}
	}
	
	static void moveLeft(int[] arr) {
		
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		
	}
}
