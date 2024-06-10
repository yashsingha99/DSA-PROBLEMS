class Solution {
    public int heightChecker(int[] h) {
        int exp[] = h.clone(), n = h.length, cnt = 0;
        Arrays.sort(exp);
        for(int i = 0; i < n; i++ ){
           if(h[i] != exp[i]) cnt++;
        }
        return cnt;
    }
}