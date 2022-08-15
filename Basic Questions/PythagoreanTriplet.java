package com.prachi.practice;
import java.util.Arrays;

//If square of any two numbers in array is equal to square of third number then There is PythagoreanTriplet in the array.
public class PythagoreanTriplet {
	
	public static boolean isTriplet(int[] arr, int n) {
		
		//Brute Force Approach
		/*for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					int x = arr[i] * arr[i];
					int y = arr[j] * arr[j];
					int z = arr[k] * arr[k];
					
					if(x == y + z || y == x + z || z == x + y)
						return true;
				}
			}
		}
		return false;*/
		
		for(int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];
		
		Arrays.sort(arr);
		for(int i = n-1; i >= 2; i--) {
			int l = 0;
			int r = i-1;
			
			while(l < r) {
				if(arr[l] + arr[r] == arr[i])
					return true;
				if(arr[l] + arr[r] < arr[i])
					l++;
				else
					r--;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 6, 5 };
        int n = arr.length;
        if(isTriplet(arr, n))
        	System.out.println("Yes");
        else
        	System.out.println("No");

	}

}
