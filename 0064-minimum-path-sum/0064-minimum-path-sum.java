class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] curr = new int[m];
        curr[0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            curr[i] = curr[i - 1] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            curr[0] += grid[0][j]; 
            for (int i = 1; i < m; i++) {
                curr[i] = Math.min(curr[i], curr[i - 1]) + grid[i][j];
            }
        }

        return curr[m - 1];
    }
}
