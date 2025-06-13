class Solution {
    int[][] dp ;
    StringBuilder ans = new StringBuilder();
    int solve(String text1, String text2, int i, int j){
        if(i <= 0 || j <= 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        

        if(text1.charAt(i - 1) == text2.charAt(j - 1)){
            return dp[i][j] = 1 + solve(text1, text2, i - 1, j - 1);
        }
        return dp[i][j] = Math.max(solve(text1, text2, i, j - 1), solve(text1, text2, i - 1, j));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(), m = text2.length();
        dp = new int[n + 1][m + 1];
        for(int A[] : dp)  Arrays.fill(A, -1);
        int res = solve(text1, text2, n, m);
        // int i = 0, j = 0;
        // while(i < n || j < m){

        // }
        return res;

    }
}