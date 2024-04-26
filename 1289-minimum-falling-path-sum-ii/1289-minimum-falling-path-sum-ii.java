class Solution {
    int help(int i, int j, int[][] grid, int last, int n, int[][] dp){
        if(i == 0){
            int min  = (int)1e9;
            for(int k = 0; k < n; k++){
                if(k == last) continue;
                min = Math.min(min, grid[0][k]);
            }
            return min;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0, min = (int)1e9;
        for(int idx = 0; idx < n; idx++){
            if(idx == last) continue;
          ans = grid[i][idx] +  help(i - 1, idx , grid, idx, n, dp);
          min = Math.min(min, ans);
        }
        return dp[i][j] = min;
    }
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int dp[][] = new int[n][n];
         
        for(int i = 0; i < n; i++){
          dp[0][i] = grid[0][i];
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                int min = (int)1e9;
                for(int k = 0; k < n; k++){
                    if(k == j) continue;
                    min = Math.min(min, grid[i][j] +  dp[i - 1][k]);
                }
                dp[i][j] = min;
            }
        }
        int ans = (int)1e9;
        for(int i = 0; i < n; i++)
          ans = Math.min(ans, dp[n-1][i]);
        return ans == (int)1e9 ? grid[0][0] : ans;
    }
}