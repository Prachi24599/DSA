package com.prachi.practice;
import java.util.*;

//Armstrong Number = The sum of power of all digits by number of digits in given number is equal to original number 
public class ArmstrongNumber {
	
	public static int countDigits(int num) {
		int digits = 0;
		//count no of digits
		while(num > 0) {
			digits++;
			num /= 10;
		}
		return digits;
	}
	
	public static boolean checkArmstrong(int n) {
		int temp = n, sum = 0;
		int digits = countDigits(n);
		
		//System.out.println(digits);
		//find the sum of power of each digit in number (power by number of digits)
		while(temp > 0) {
			int rem = temp % 10;
			sum += Math.pow(rem, digits);
			temp /= 10;
		}
		//System.out.println(sum);
		//check sum with original number
		return (sum == n);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(checkArmstrong(n))
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

}
