class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length, m = grid[0].length, ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && grid[i][j] == 1) ans++;
                if(j == 0 && grid[i][j] == 1) ans++;
                if(i == n-1 && grid[i][j] == 1) ans++;
                if(j == m-1 && grid[i][j] == 1) ans++;
                if(i > 0 && grid[i][j] == 1 && grid[i - 1][j] == 0) ans++;
                if(j > 0 && grid[i][j] == 1 && grid[i][j - 1] == 0) ans++;
                if(i < n-1 && grid[i][j] == 1 && grid[i + 1][j] == 0) ans++;
                if(j < m-1 && grid[i][j] == 1 && grid[i][j + 1] == 0) ans++;
            }
        }
        return ans;
    }
}