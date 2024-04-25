class Solution {
    int help(int i, int n, String s1, int k, int[][] dp, char ch){
        if(i >= n) return 0;
        if(dp[i][ch] != -1) return dp[i][ch];
        int t = 0, nt = 0;
        if(Math.abs(ch - s1.charAt(i)) <= k || ch == '#')
           t = 1 + help(i + 1, n, s1, k, dp, s1.charAt(i));
        nt = help(i + 1, n, s1, k, dp, ch);
        return dp[i][ch] = Math.max(t, nt);
    }
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int dp[][] = new int[n + 1][130];
        for(int i = 0; i < n; i++)
           Arrays.fill(dp[i], -1);
        return help(0, n, s, k, dp, '#');
    }
}