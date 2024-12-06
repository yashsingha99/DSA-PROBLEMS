class Solution {
     Set<Integer> set;
     int[] dp;
    int find (int[] arr, int idx, int n, int maxSum){
        if(idx > n || maxSum <= 0) return 0;
        if(dp[idx] != -1) return dp[idx];
        int l = 0, r = 0;
        if(!set.contains(idx) && maxSum >= idx)
         l = 1 + find(arr, idx + 1, n, maxSum - idx);
         r = find(arr, idx + 1, n, maxSum);

        return dp[idx] = Math.max(l , r);

    }
    public int maxCount(int[] banned, int n, int maxSum) {
        set = new HashSet<>();
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        for(int i : banned){
            set.add(i);
        }
        return find(banned, 1, n, maxSum);
    }
}