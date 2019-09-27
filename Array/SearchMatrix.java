package com.company;

public class SearchMatrix {

    public static  void searchInMatrix(int[][] matrix, int target){
        int i = 0, j = matrix[0].length - 1;

        if(matrix.length == 0)
            return;

        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                System.out.print("Found at index: " + i + "," + j);
                break;
            }
            else if(target < matrix[i][j]){
                j--;
            }
            else if(target > matrix[i][j]){
                i++;
            }
        }

    }
}
