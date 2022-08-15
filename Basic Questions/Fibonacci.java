package com.prachi.java;
import java.util.*;

public class Fibonacci {

	public static void fibo(int n) {
		int a = 0, b = 1;
		if(n < 0) {
			System.out.println("Enter valid number");
			return;
		}
		if(n >= 1) {
			System.out.print(a + " " + b + " ");
			for(int i = 3; i <= n; i++) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		fibo(n);
		scan.close();
	}

}
