class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n = t1.length(), m = t2.length();
        int dp[][] = new int[n+1][m+1]; 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(t2.charAt(j-1) == t1.charAt(i-1))
                  dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}