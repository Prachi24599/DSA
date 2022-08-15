package com.prachi.java;
import java.util.*;

//update 
// 0 -> 1
// 1 -> 0
public class BitUpdateOperation {	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int ope = scan.nextInt(); // If operation = 1 then change 0 to 1 (SET), If Operation = 0 then change 1 to 0(CLEAR)

		int n = 5;//0101
		int pos = 1;
		int bitMask = 1 << pos;
	
		
		if(ope == 1) {
			int newNum = bitMask | n;
			System.out.println(newNum);

		}else if(ope == 0){
			int notBM = ~(bitMask);
			int newNum = notBM & n;
			System.out.println(newNum);
		}
		scan.close();
	}
}
