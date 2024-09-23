class Solution {
    int n = 0;
    Set<String> set;
    int[] dp;
    int solve(String s, int idx){
        if(idx >= n) return 0;
        if(dp[idx] != -1) return dp[idx];
        int res = 1  + solve(s, idx + 1);
        for(int i = idx; i < n; i++){
            if(set.contains(s.substring(idx, i + 1)))
              res = Math.min(res, solve(s, i + 1));
        }
        return dp[idx] = res;
    }
    public int minExtraChar(String s, String[] dic) {
       n = s.length();
       set = new HashSet<>();
       dp = new int[n + 1];
       Arrays.fill(dp, -1);
       for(String str : dic)
          set.add(str);
       
       return solve(s, 0);
    }
}