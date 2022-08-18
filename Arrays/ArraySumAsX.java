//check if sum of 2 array elements is equal to given x
package com.prachi.practice;
import java.util.Arrays;

public class ArraySumAsX {

	public static boolean checkSum(int[] arr, int n, int x) {
		//Brute force approach
		/*for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] + arr[j] == x) {
					System.out.println("Pair with a given sum " + x + " is " + "(" + arr[i] + "," + arr[j] + ")");
					return true;
				}
			}
		}
		return false*/;
		
		Arrays.sort(arr);
		int l = 0, r = n-1;
		
		while(l != r) { //while(l-r)
			if(arr[l] + arr[r] == x)
				return true;
			else if(arr[l] + arr[r] < x)
				l++;
			else if(arr[l] + arr[r] > x)
				r--;
		}

		return false;
	}
	
	public static void main(String[] args) {

		int arr[] = {1, 4, 45, 8, 10, -8};
		int x = 16, n = arr.length;
		
		if(checkSum(arr, n, x))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}
}
