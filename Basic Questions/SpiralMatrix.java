package com.prachi.java;
public class SpiralMatrix {

	public static void printSpiralMatrix(int[][] arr, int rows, int columns) {
		
		int rowstart = 0;
		int rowend = rows-1; // 4
		int colstart = 0;
		int colend = columns-1; // 5
		
		while(rowstart <= rowend && colstart <= colend) {
			
			for(int col = colstart; col <= colend; col++)
				System.out.print(arr[rowstart][col] + " ");
			
			rowstart++;
			
			for(int row = rowstart; row <= rowend; row++) 
				System.out.print(arr[row][colend] + " ");
			
			colend--;
			
			for(int col = colend; col >= colstart; col--)
				System.out.print(arr[rowend][col] + " ");
			
			rowend--;
			
			for(int row = rowend; row >= rowstart; row--)
				System.out.print(arr[row][colstart] + " ");
			
			colstart++;
			
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int n = 5, m = 6; // Number of rows and columns
		int[][] arr = {{1, 5, 7, 9, 10, 11},
					   {6, 10, 12, 12, 20, 21},
					   {9, 25, 29, 30, 32, 41},
					   {15, 55, 59, 63, 68, 70},
					   {40, 70, 79, 81, 95, 105}};
		
		printSpiralMatrix(arr, n, m);
		
	}
}

/*
 * output
  	1 5 7 9 10 11 21 41 70 105 95 81 79 70 40 15 9 6 
	10 12 12 20 32 68 63 59 55 25 
	29 30 29 
*/