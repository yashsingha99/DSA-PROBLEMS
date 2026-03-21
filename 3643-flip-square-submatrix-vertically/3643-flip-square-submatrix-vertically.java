class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] ans = new int[2][3];
        int n = grid.length, m = grid[0].length;
        int i1 = x, i2 = x + k - 1;
        while(i1 < i2){
            for(int j = y; j < y + k; j++){
                int temp = grid[i1][j];
                grid[i1][j] = grid[i2][j];
                grid[i2][j] = temp;
            }
            i1++;i2--;
        }
        return grid;
                
    }
}