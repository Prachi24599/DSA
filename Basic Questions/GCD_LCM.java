package com.prachi.java;
import java.util.*;
//GCD - Greatest Common Divisor/ HCF = Highest Common Factor
//LCM - Least Common Multiple

public class GCD_LCM {
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		else return gcd(b, a%b);
	}
	
	public static int lcm(int a, int b) {
		return (a * b)/gcd(a, b);
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("GCD = "+ gcd(a, b));
		System.out.println("LCM = "+ lcm(a, b));
		scan.close();
	}
}
