package com.prachi.java;

//Get the 3rd Bit (position = 2) of a number n (0101)
//Bit Mask : 1 << i(pos)
//Operation : AND
public class BitGetOperation {

	public static void main(String[] args) {
		int n = 5; //0101 - In binary we count position from right to left starting from 0
		int pos = 3;
		int bitMask = 1<<pos;
		
		if((bitMask & n )== 0)
			System.out.println("Bit was Zero");
		else
			System.out.println("Bit was One");

	}

}
