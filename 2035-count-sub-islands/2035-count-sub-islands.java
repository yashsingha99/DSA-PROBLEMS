class Solution {
    boolean isSubIsland(int[][] grid1, int[][] grid2, int i, int j){
        if(i < 0 || j < 0 || grid1.length <= i || grid1[0].length <= j)
            return true;
        if(grid2[i][j] != 1) return true;
        grid2[i][j] = -1;

        boolean check = (grid1[i][j] == 1);
        check &= isSubIsland(grid1, grid2, i + 1, j);
        check &= isSubIsland(grid1, grid2, i, j + 1);
        check &= isSubIsland(grid1, grid2, i - 1, j);
        check &= isSubIsland(grid1, grid2, i, j - 1);
        return check;
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n = grid1.length;
        int m = grid1[0].length, res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid2[i][j] == 1 && isSubIsland(grid1, grid2, i, j))
                   res++;
            }
        }
        return res;
    }
}