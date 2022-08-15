package com.prachi.practice;
import java.util.*;

//A number is said to be a perfect number if the sum of its proper divisors ( i.e. all positive divisors excluding the number itself )is equal to that number itself. 
//Aliquot sum is the sum of divisors of a number, excluding the number itself.
//Hence, a number is a perfect number only if it is equal to its aliquot sum. 
//All known perfect numbers are even. 

public class PerfectNumber {
	
	public static boolean checkPerfectNum(int n) {

		if(n == 1)
			return false;
		
		int sum = 1; //because 1 is factor of every number
		/*for(int i = 2; i < n; i++) {
			if(n % i == 0)
				sum += i;
		}*/
		
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				if(i * i == n)
					sum += i;
				else
					sum += i + (n/i);
			}
		}
		return (n == sum);
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(checkPerfectNum(n)) 
			System.out.println("Yes It is Perfect Num");
		else
			System.out.println("No It is not Perfect Num");

		scan.close();
	}

}
