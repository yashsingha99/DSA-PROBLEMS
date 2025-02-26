class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxSum = (int) -1e9, minSum = (int) 1e9;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++){
            sum1 += nums[i];
            sum2 += nums[i];
            if(sum1 < 0) sum1 = 0;
            if(sum2 > 0) sum2 = 0;
            maxSum = Math.max(maxSum, sum1);
            minSum = Math.min(minSum, sum2);
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}