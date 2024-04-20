class Solution {

    int help(int[] coins, int tar, int[] dp) {
        if (tar < 0)
            return (int) 1e9;
        if (tar == 0)
            return 0;
        if (dp[tar] != -1)
            return dp[tar];
        int min = (int) 1e9;
        for (int i = 0; i < coins.length; i++) {
            int ans = help(coins, tar - coins[i], dp);
            if (ans != (int) 1e9)
                min = Math.min(ans + 1, min);
        }
        return dp[tar] = min;
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, -1);
        int min = help(coins, amount, dp);
        return min == (int) 1e9 ? -1 : min;
    }
}