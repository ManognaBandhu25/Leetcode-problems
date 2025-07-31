class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
    //1st do the transpose of matrix -> convert column into row
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Then reverse each row
         for(int i=0;i<n;i++) reverse(matrix[i]);  
    }
//Method to reverse array
    public void reverse(int[] row){
        int start = 0, end = row.length - 1;
        while(start < end){
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }
}