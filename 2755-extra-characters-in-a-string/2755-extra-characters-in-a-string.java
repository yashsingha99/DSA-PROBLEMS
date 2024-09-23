class Solution {
    public int minExtraChar(String s, String[] dic) {
        int n = s.length();
        Set<String> set = new HashSet<>();
        for(String str : dic)
          set.add(str);
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = 1 + dp[i + 1];
            for (int j = i; j < n; j++) {
                if (set.contains(s.substring(i, j + 1)))
                    dp[i] = Math.min(dp[i], dp[j + 1]);
            }
        }
        return dp[0];
    }
}