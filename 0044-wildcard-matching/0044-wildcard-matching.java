class Solution {
    boolean help(String s, String p, int i, int j, int[][] dp){
        if(i >= 0 && j < 0) return false;
        if(j < 0 && i < 0) return true;
        if(j >= 0 && i < 0) {
            for(int k = 0; k <= j; k++)
                if(p.charAt(k) != '*') return false;
            return true;
        }
        if(dp[i][j] != -1) return dp[i][j] == 1 ? true : false;
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
         boolean l = help(s, p, i - 1, j - 1, dp);
         dp[i][j] = l == true ? 1 : 0;
          return  l;
        }
        if(p.charAt(j) == '*'){
          boolean l = help(s, p, i - 1, j, dp) || help(s, p, i, j - 1, dp);
          dp[i][j] = l == true ? 1 : 0;
          return  l;
        }
        dp[i][j] = 0;
        return  false;
    }
    public boolean isMatch(String s, String p) {
        int m = p.length(), n = s.length();
        int dp[][] = new int[n][m];
        for(int i = 0; i < n; i++)
           Arrays.fill(dp[i], -1);
       return help(s, p, n - 1, m - 1, dp);
    }
}