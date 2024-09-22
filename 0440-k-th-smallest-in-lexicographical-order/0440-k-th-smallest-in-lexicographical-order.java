class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;
        while(k > 0){
            int num = solve(curr, curr + 1, n);
            if(num <= k){
              k -= num;
              curr++;
            } else {
                k--;
                curr *= 10;
            }
        }
        return curr;
    }
    int solve(long curr, long next, int n){
        int diff = 0;
        while(curr <= n){
          diff += next - curr;
          curr *= 10;
          next *= 10;
          next = Math.min(next, (long)n + 1);
        }
        return diff;
    }
}
