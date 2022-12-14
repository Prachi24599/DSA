package com.prachi.java;

//Clear the 3rd bit (position = 2) of a number n (0101)
//Bit Mask : 1 << pos
//Not of BM (~BM)
//AND it with original number

public class BitClearOperation {
	public static void main(String args[]) {
		int n = 5; // 0101
		int pos = 2;
		int bitMask = 1 << pos;
		int notBitMask = ~(bitMask);
		
		int newNumber = notBitMask & n;
		System.out.println(newNumber);
	}
}
