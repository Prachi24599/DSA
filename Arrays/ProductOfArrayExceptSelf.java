package com.prachi.practice2;
import java.util.Arrays;
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

public class ProductOfArrayExceptSelf {
	public static int[] productExceptSelf(int[] nums) {
		//Brute force Approach - Time complexity = O(n^2)
        //Runtime Error - Time Limit Exceeded 
        /*int n = nums.length;
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++){
        	int product = 1;
        	for(int j = 0; j < n; j++){
        		if(i != j) product *= nums[j];
        	}
        	ans[i] = product;
        }   
        return ans;*/
		
		//Another Brute force approach
		int n = nums.length; 
        int[] ans = new int[n];
        
        int prev = 1, next = 1;
        for(int i = 0; i < n; i++){
            prev = calculateProduct(nums, 0, i);
            next = calculateProduct(nums, i+1, n);
            ans[i] = prev * next; 
        }
        return ans; 
    }
	public static int calculateProduct(int[] nums, int start, int end){
        int product = 1;
        for(int i = start; i < end; i++) {
            product = product * nums[i];
        }    
        //System.out.print(product + " ");
        return product;
	}
  
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] ans = productExceptSelf(nums);
		System.out.println(Arrays.toString(ans));
	}
}