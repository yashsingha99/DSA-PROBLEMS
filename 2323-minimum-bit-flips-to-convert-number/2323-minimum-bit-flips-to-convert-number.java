class Solution {
    public int minBitFlips(int st, int g) {
        int idx = 0, n1 = st, n2 = g, cnt = 0;
        while(n1 != 0 && n2 != 0){
            if((n1 & 1) != (n2 & 1)) cnt++;
            n1 >>= 1;
            n2 >>= 1;
        }
        while(n1 != 0) {
            if((n1 & 1) != 0) cnt++;
            n1 >>= 1;
        }
        while(n2 != 0) {
            if((n2 & 1) != 0) cnt++;
            n2 >>= 1;
        }
        return cnt;
    }
}