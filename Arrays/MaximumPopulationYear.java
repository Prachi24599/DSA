//Maximum Population Year
/*
 * 	You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
	The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
	Return the earliest year with the maximum population.
 */

package com.prachi.practice2;

import java.util.Arrays;

public class MaximumPopulationYear {
	
    public static int maximumPopulation(int[][] logs) {
        int years = 2050 - 1950 + 1;
        int[] count = new int[years];
        int n = logs.length;
        
        for(int i = 0; i < n; i++){
        	count[logs[i][0] - 1950]++;
        	count[logs[i][1] - 1950]--;
        }
       
        //calculate running sum
        for(int i = 1; i < years; i++) {
        	count[i] += count[i-1]; 
        }
        System.out.println(Arrays.toString(count));
        
        int maxYear = 1950, maxValue = 0;
        for(int i = 0; i < years; i++){
            if(count[i] > maxValue){
                maxValue = count[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
	}

    public static void main(String[] args) {
    	int[][] logs = {{1993,1999},{2000,2010}};
    	System.out.println(maximumPopulation(logs));
    }
}
