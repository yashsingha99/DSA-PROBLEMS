class Solution {
    boolean isEqual(int[][] mat, int[][] tar) {
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] != tar[i][j]) return false;
            }
        }
        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        if(isEqual(mat, target)) return true;
        for(int k = 0; k < 3; k++){
            for(int i = 0; i < n / 2; i++){
                for(int j = 0; j < (n + 1) / 2; j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[n - j - 1][i];
                    mat[n - j - 1][i] = mat[n - i - 1][n - j - 1];
                    mat[n - i - 1][n - j - 1] = mat[j][n - i - 1];
                    mat[j][n - i - 1] = temp;
                } 
            }
            if(isEqual(mat, target)) return true;
        }
        return false;
    }
}