package com.prachi.practice2;

/*
 * Given a square matrix mat, return the sum of the matrix diagonals.
	Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 */
public class DiagonalSum {

    public static int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j)
                    sum += mat[i][j];
                
                if((i+j == (n-1)) && i != j)
                    sum += mat[i][j];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
    	int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    	
    	System.out.println(diagonalSum(mat));
    }
}
