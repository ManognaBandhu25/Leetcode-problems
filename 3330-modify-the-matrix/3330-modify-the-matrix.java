class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(max<matrix[j][i]){
                    max=matrix[j][i];
                }
            }
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]==-1){
                  matrix[j][i]=max;
                }
            }
        }
        return matrix;
        
    }
}