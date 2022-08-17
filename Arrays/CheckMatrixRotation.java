//Determine Whether Matrix Can Be Obtained By Rotation
//Given two n x n binary matrices mat and target, return true if it is possible to make 
//mat equal to target by rotating mat in 90-degree increments, or false otherwise.

package com.prachi.practice2;
import java.util.Arrays;
public class CheckMatrixRotation {

	 public static boolean findRotation(int[][] mat, int[][] target) {
	        int n = mat.length;
	        int[][] rotate = new int[n][n];
	        
	        for(int rotation = 1; rotation <= 4; rotation++){
	            for(int i = 0, k = n-1; i < n; i++, k--){
	                for(int j = 0; j < n; j++){
	                    rotate[i][j] = mat[j][k];
	                }
	            }
	            updatedArray(rotate, mat, n);
	            
	            System.out.println(Arrays.deepToString(rotate));
	            //if(checkWithTarget(rotate, target, n))
	            if(Arrays.deepEquals(rotate, target))
	                return true;
	        }
	        return false;   
	    }
	    
	 	public static void updatedArray(int[][] rotate, int[][] mat, int n) {
	 		 for(int i = 0; i < n; i++){
	             for(int j = 0; j < n; j++){
	            	 mat[i][j] = rotate[i][j];
	             }
	 		 }
	 	}
	   /* public static boolean checkWithTarget(int[][] rotate, int[][] target, int n){
	        for(int i = 0; i < n; i++){
	             for(int j = 0; j < n; j++){
	                 if(rotate[i][j] != target[i][j])
	                     return false;
	             }
	        }
	        return true;
	    }*/
	    
	public static void main(String[] args) {
//		int[][] mat = {{0,0,0},{0,1,0},{1,1,1}}; 
//		int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
		
		int[][] mat = {{0,1},{1,1}};
		int[][] target = {{1,0},{0,1}};
		System.out.println(findRotation(mat, target));
		
		
	}

}
