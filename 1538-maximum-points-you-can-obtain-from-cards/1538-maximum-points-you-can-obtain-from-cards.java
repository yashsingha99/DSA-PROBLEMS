class Solution {
    public int maxScore(int[] card, int k) {
        int n = card.length, total = 0;

        for(int i : card) total += i;
        int windowSize = n - k, res = -1;
        int sumOfWindow = total;
        for(int i = n - 1; i >= n - k; i--) sumOfWindow -= card[i];
        res = Math.max(res, total - sumOfWindow);
        for(int i = n - k; i < n; i++){
              sumOfWindow = sumOfWindow - card[i - (n - k)] + card[i];
              res = Math.max(res, total - sumOfWindow);
        }
        return res;
    }
}