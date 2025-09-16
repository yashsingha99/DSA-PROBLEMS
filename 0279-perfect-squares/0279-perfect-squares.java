// brute force TC:- O(sqrt(N) * N) , SC:- O(sqrt(N) * N)
// class Solution {
//     int solve(int n){
//         if(n <= 0) return 0; 
//         int ans = (int)1e9;
//         for(int i = 1; i * i <= n; i++){
//             ans = Math.min(ans, 1 + solve(n - i * i));
//         }
//         return ans;
//     }
//     public int numSquares(int n) {
//         return solve(n);
//     }
// }


// Modrate ( Memoize ) TC:- O(), SC:- O()
class Solution {
    int solve(int n, int[] dp){
        if(n <= 0) return 0; 
        int ans = (int)1e9;
        if(dp[n] != -1) return dp[n];
        for(int i = 1; i * i <= n; i++){
            ans = Math.min(ans, 1 + solve(n - i * i, dp));
        }
        return dp[n] = ans;
    }
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
}