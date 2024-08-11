class Solution {
    void dfs(int[][] grid, int[][]vis, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || vis[i][j] == 1 || grid[i][j] == 0){
            return;
        }
        vis[i][j] = 1;
        dfs(grid, vis, i + 1, j);
        dfs(grid, vis, i, j + 1);
        dfs(grid, vis, i - 1, j);
        dfs(grid, vis, i, j - 1);
    }
    int getNoOfIsland(int[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length];
        int island = 0;
        for (int i = 0; i < grid.length; i++) 
            for (int j = 0; j < grid[0].length; j++) 
                if(grid[i][j] == 1 && vis[i][j] == 0){
                   dfs(grid, vis, i, j);
                   island++;
                }
        return island;
    }

    public int minDays(int[][] grid) {
        int island = getNoOfIsland(grid);
        if (island > 1 || island == 0) {
            return 0;
        } else {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j] == 1){
                       grid[i][j] = 0;
                       int islandCnt = getNoOfIsland(grid);
                       if (islandCnt > 1 || islandCnt == 0) return 1;
                       grid[i][j] = 1;
                    }
                }
            }
        }
        return 2;
    }
}