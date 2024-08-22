class Solution {
    public int findComplement(int num) {
      int ans = 0, idx = 0;
      while(num > 0){
        if((num & 1) == 0){
            ans += (int)Math.pow(2, idx);
        }
        idx++;
        num >>= 1;
      }
      return ans;
    }
}