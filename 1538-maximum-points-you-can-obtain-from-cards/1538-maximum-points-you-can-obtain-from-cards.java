class Solution {
    public int maxScore(int[] card, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) sum += card[i];

        int i = k - 1, j = card.length - 1;
        int res = sum;
        while(i >= 0){
           sum = sum - card[i--] + card[j--];
           res = Math.max(res, sum);
        }
        return res;
    }
}