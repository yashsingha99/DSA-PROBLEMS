class Solution {
    public int maxProfitAssignment(int[] diff, int[] pro, int[] wor) {
        int maxDiff = 0, n = diff.length;
        for(int i : diff)
          maxDiff = Math.max(maxDiff, i);

        int bestProfit[] = new int[maxDiff + 1];
        for(int i = 0; i < n; i++)
            bestProfit[diff[i]] = Math.max(bestProfit[diff[i]], pro[i]);

        int maxProfit = 0;
        for(int i = 0; i <= maxDiff; i++){
            if(maxProfit < bestProfit[i]) 
               maxProfit = bestProfit[i];
            bestProfit[i] = maxProfit;
        }
        int res = 0;
        for(int w : wor){
            if(w > maxDiff)
              res += bestProfit[maxDiff];
            else 
              res += bestProfit[w];
        }
        return res;
    }
}