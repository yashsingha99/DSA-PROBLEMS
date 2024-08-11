class Solution {
     void noOfIslandDFS(int[][]mat, int i, int j, int n, int m){
        if(i >= n || j >= m || i < 0 || j < 0 || mat[i][j] == 1)
          return;
        mat[i][j] = 1;
        noOfIslandDFS(mat, i + 1, j, n, m);
        noOfIslandDFS(mat, i, j + 1, n, m);
        noOfIslandDFS(mat, i - 1, j, n, m);
        noOfIslandDFS(mat, i, j - 1, n, m);
     }
    public int regionsBySlashes(String[] grid) {
        int n = grid.length, m = grid[0].length(), regions = 0;
        int mat[][] = new int[n * 3][m * 3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               if(grid[i].charAt(j) == '/'){
                  mat[i * 3][j * 3 + 2] = 1;
                  mat[i * 3 + 1][j * 3 + 1] = 1;
                  mat[i * 3 + 2][j * 3] = 1;
               } else if(grid[i].charAt(j) == '\\'){
                  mat[i * 3][j * 3] = 1;
                  mat[i * 3 + 1][j * 3 + 1] = 1;
                  mat[i * 3 + 2][j * 3 + 2] = 1;
               }
            }
        }
        for(int i = 0; i < n * 3; i++){
            for(int j = 0; j < m * 3; j++){
                if(mat[i][j] == 0){
                    noOfIslandDFS(mat, i, j, n * 3, m * 3);
                    regions++;
                }
            }
        }
        return regions;
    }
}