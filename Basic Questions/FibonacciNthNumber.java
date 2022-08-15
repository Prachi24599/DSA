package com.prachi.java;
import java.util.*;

//Give the Nth fibonacci Number

public class FibonacciNthNumber {

	public static int fib(int n) {
		if(n <= 1) //If n == 0 return 0 and If n == 1 return 1 
			return n;
		
		return fib(n-1)+fib(n-2);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fib(n));
	}
}
