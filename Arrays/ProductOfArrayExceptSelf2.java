package com.prachi.practice2;
import java.util.Arrays;

public class ProductOfArrayExceptSelf2 {
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] prefix = new int[n];
		int[] postfix = new int[n];
		int[] ans = new int[n];
	
		
		prefix[0] = nums[0];
		for(int i = 1; i < n; i++) {
			prefix[i] = prefix[i-1] * nums[i];
		}
	
		postfix[n-1] = nums[n-1];
		for(int i = n-2; i >= 0; i--) {
			postfix[i] = postfix[i+1] * nums[i];
		}

		for(int i = 0; i < n; i++) {
			if(i == 0) ans[i] = postfix[i+1];
			else if(i == n-1) ans[i] = prefix[i-1];
			else ans[i] = prefix[i-1] * postfix[i+1];
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] ans = productExceptSelf(nums);
		System.out.println(Arrays.toString(ans));
	}
}
