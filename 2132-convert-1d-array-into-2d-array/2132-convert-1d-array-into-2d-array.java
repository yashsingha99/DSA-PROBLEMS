class Solution {
    public int[][] construct2DArray(int[] ori, int m, int n) {
        int[][] res = new int[m][n];
        int len = ori.length, c = 0, d = 0;
        if(m * n != len) return new int[0][0];
        for(int i = 0; i < len; i++){
          if(c == n) {
           c = 0; d++;
          }
          res[d][c++] = ori[i];
        }
        return res;
    }
}