package com.prachi.java;

public class FibonacciUsingDP {
	
	public static int[] fibo(int n) {
		int[] arr = new int[n+2]; // n+2 because Initially we need array of size 2 even if n = 0 to store arr[0] and arr[1]
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		return arr;
	}
	public static void main(String args[]) {
		int n = 9;
		int[] arr = fibo(n);
		for(int i = 0; i < n; i++) 
			System.out.print(arr[i]+ " ");
	}
}
