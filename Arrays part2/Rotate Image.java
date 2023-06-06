//https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int[][] matrix){
        //swap matrix[row][col] with matrix[col][row]
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void reverse(int[][] matrix){
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                //swap arr[i][j] with arr[i][n-j-1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}