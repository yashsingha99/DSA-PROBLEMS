class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n && prices[j] > prices[i])
                j++;
            System.out.print(j + " ");
            if (j < n) {
                prices[i] -= prices[j];
            }
        }
        return prices;
    }
}