class Solution {
    public int minBitFlips(int st, int g) {
        int idx = 0, cnt = 0;
        while(st != 0 || g != 0){
            if((st & 1) != (g & 1)) cnt++;
            st >>= 1;
            g >>= 1;
        }
        return cnt;
    }
}