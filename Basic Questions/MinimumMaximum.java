package com.prachi.practice;
import java.util.*;


//From the given 3 numbers, find the maximum and minmun
public class MinimumMaximum {
	
	public static int maximum(int a, int b, int c) {
		int max = a;
		if(b > max)
			max = b;
		
		if(c > max) 
			max = c;
		
		return max;
	}
	
	public static int minimum(int a, int b, int c) {
		int min = a;
		if(b < min)
			min = b;
		
		if(c < min)
			min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println(maximum(a, b, c));
		System.out.println(minimum(a, b, c));
		
		scan.close();
	}
}
