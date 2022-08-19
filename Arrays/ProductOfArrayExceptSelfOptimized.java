package com.prachi.practice2;
import java.util.Arrays;

public class ProductOfArrayExceptSelfOptimized {
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		
		ans[0] = 1; //prefix for first element at 0th index is kept as 1
		//calculating prefix values
		for(int i = 1; i < n; i++) {
			ans[i] = ans[i-1] * nums[i-1];
		}
		
		//calculating postfix values
		int temp = 1;
		for(int i = n-1; i >= 0; i--) {
			ans[i] = ans[i] * temp;
			temp = temp * nums[i];
		}	
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] ans = productExceptSelf(nums);
		System.out.println(Arrays.toString(ans));
	}
}
