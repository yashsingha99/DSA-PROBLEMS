 class Solution {
    public long minEnd(int n, int x) {
        int bit[] = new int[64];
        n--; // to find direct n - 1 value
        for (int i = 0; i < 32; i++) {
            bit[i] = (x >> i) & 1;
        }
        for (int i = 0; i < 64 && n != 0; i++) {
            if (bit[i] == 0) {
                bit[i] = (n & 1);
                n >>= 1;
            }
        }
        long ans = 0;
        for(int i = 0; i < 64; i++){
             ans += bit[i] * (1l << i);
        }
        return ans;
    }
}