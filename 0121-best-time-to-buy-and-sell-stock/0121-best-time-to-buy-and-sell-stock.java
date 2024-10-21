class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], ans = 0;
        for(int i = 0; i < prices.length; i++){
           buy = Math.min(buy, prices[i]);
           ans = Math.max(ans, prices[i] - buy);
        }
        return ans;
    }
}