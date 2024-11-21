class Solution {
    public int countUnguarded(int m, int n, int[][] g, int[][] w) {
        int[][] arr = new int[m][n];
         for(int i = 0; i < g.length; i++){
            arr[g[i][0]][g[i][1]] = 1;
        }
        
        for(int i = 0; i < w.length; i++){
            arr[w[i][0]][w[i][1]] = 2;
        }
        for(int i = 0; i < m; i++){
           for(int j = 0; j < n; j++){
            if(arr[i][j] == 1){
               int pos = i + 1;
               while(pos < m && arr[pos][j] != 1 && arr[pos][j] != 2) arr[pos++][j] = -1;
               pos = j + 1;
               while(pos < n && arr[i][pos] != 1 && arr[i][pos] != 2) arr[i][pos++] = -1;
               pos = i - 1;
               while(pos >= 0 && arr[pos][j] != 1 && arr[pos][j] != 2) arr[pos--][j] = -1;
               pos = j - 1;
               while(pos >= 0 && arr[i][pos] != 1 && arr[i][pos] != 2) arr[i][pos--] = -1;
            }
           }
        }
        int cnt = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }
}