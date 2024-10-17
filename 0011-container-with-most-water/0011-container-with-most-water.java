class Solution {
    public int maxArea(int[] h) {
        int i = 0, j = h.length - 1;
        int ans = -1;
        while(i < j){
          int hi = Math.min(h[i], h[j]);
          int w = j - i;
          ans = Math.max(ans, hi * w);
          if(h[i] < h[j]) i++;
          else j--;
        }
        return ans;
    }
}