class Solution {
    public int[][] spiralMatrixIII(int n, int m, int r, int c) {
        int[][] res = new int[n * m][2];
        int dirX[] = {0, 1, 0, -1}, dir = 0, steps = 0, idx = 1;
        int dirY[] = {1, 0, -1, 0};  
        res[0][0] = r;
        res[0][1] = c;
        while(idx < n * m){
           if(dir == 0 || dir == 2) steps++;

           for(int i = 0; i < steps; i++){
               r += dirX[dir];
               c += dirY[dir];
               if(r < n && c < m && r >= 0 && c >= 0){
                 res[idx][0] = r; 
                 res[idx++][1] = c;
               }
               
           }
           dir = (dir + 1) % 4;
           
        }
        return res;
    }
}