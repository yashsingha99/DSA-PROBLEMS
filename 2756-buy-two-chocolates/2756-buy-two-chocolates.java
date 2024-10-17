class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int low = 101, low2 = 0;
        for(int i = 0; i < n; i++){
           if(low > prices[i] ){
            low2 = low;
            low = prices[i];
           } else {
              low2 = Math.min(low2, prices[i]);
           }
        }
        int num = money - (low + low2);
        if(num >= 0) return  num;
        return money;
    }
}