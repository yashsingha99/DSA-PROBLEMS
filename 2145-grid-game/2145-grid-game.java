class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long[][] mat = new long[2][n];
        mat[0][0] = grid[0][0];
        mat[1][n - 1] = grid[1][n - 1]; 
        for (int i = 1; i < n; i++)
            mat[0][i] = mat[0][i - 1] + grid[0][i];

        for (int i = n - 2; i >= 0; i--)
            mat[1][i] = mat[1][i + 1] + grid[1][i];

        long min = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long row1 = mat[0][n - 1] - mat[0][i];
            long row2 = mat[1][0] - mat[1][i];
            min = Math.min(min, Math.max(row1, row2));
        }
        return min;
    }
}