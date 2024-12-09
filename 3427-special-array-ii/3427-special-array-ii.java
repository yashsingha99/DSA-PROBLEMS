class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] q) {
        int n = nums.length;
        int dp[] = new int[n];

        for(int i = 1; i < n; i++){
           dp[i] = dp[i - 1];
           if((nums[i - 1] & 1) == (nums[i] & 1)){
              dp[i] = i;
           }
        }

         boolean[] res = new boolean[q.length];
         for(int i = 0; i < q.length; i++){
           int start = dp[q[i][0]], end = dp[q[i][1]];
           if(start - end == 0){
            res[i] = true;
           }
         }
         return res;

    }
}