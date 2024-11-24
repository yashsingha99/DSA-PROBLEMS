class Solution {
    public long maxMatrixSum(int[][] mat) {
        long sum = 0, cnt = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                long num = Math.abs(mat[i][j]);
                 min = Math.min(min, num);
                 sum += num;
                 if(mat[i][j] < 0) cnt++;
            }
        }
        return ((cnt & 1) == 0 ? sum : sum - (2 * min));
    }
}