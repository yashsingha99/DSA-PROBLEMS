class Solution {
    public long minEnd(int n, int x) {
        long ans = x;
        while(n-- > 1){
           ans = (x | (ans + 1));
        }
        return ans;
    }
}