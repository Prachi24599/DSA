package com.prachi.java;

//set the 2nd bit (position 1) of number n
//BitMask : 1 << i
//Operation : OR

public class BitSetOperation {
	public static void main(String args[]) {
		int n = 5; // 0101
		int pos = 1;
		int bitMask = 1 << pos;
		
		int newNumber = bitMask | n;
		System.out.println(newNumber);
	}
}
