class Solution {
    Map<Integer, Integer> map;
    Boolean[][] dp;
    boolean solve(int i, int k, int[] stones){
        if(i < 0 || i >= stones.length) return false;
        if(i == stones.length - 1) return true;
        if(dp[i][k] != null) return dp[i][k];
        int p1 = k - 1, p2 = k, p3 = k + 1;
        boolean r1 = false, r2 = false, r3 = false;
        if(p1 > 0 && map.containsKey(stones[i] + p1)){
          r1 = solve(map.get(stones[i] + p1), p1, stones);
        }
        if(p2 > 0 && map.containsKey(stones[i] + p2)){
          r2 = solve(map.get(stones[i] + p2), p2, stones);
        }
        if(p3 > 0 && map.containsKey(stones[i] + p3)){
          r3 = solve(map.get(stones[i] + p3), p3, stones);
        }
        return dp[i][k] = r1 | r2 | r3;
    }
    public boolean canCross(int[] stones) {
        if(stones[1] != 1) return false;
        int n = stones.length;
        dp = new Boolean[n + 1][n + 1];
        map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(stones[i], i);
        }
        return solve(1, 1, stones);
    }
}