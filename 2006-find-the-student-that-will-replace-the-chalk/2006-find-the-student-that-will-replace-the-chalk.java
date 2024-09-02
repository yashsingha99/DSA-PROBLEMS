class Solution {
    public int chalkReplacer(int[] ch, int k) {
        int n = ch.length;
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += ch[i];
            if(sum > k) break;
        }
        k = (k % (int) sum);
        for(int i = 0; i < n; i++){
             if(k < ch[i]) return i;
             k -= ch[i];
        }
        return 0;
    }
}