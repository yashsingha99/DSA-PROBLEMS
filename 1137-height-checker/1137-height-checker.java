class Solution {
    public int heightChecker(int[] h) {
        int  n = h.length, c = 0, cnt = 0;
        int count[] = new int[101];
        int exp[] = new int[n];
        for(int i : h)
          count[i]++;
        for(int i = 0; i < 101 && c < n; i++){
            while(count[i] > 0){
              exp[c++] =  i;
              count[i]--;
            }
        }
         for(int i = 0; i < n; i++ )
           if(h[i] != exp[i]) cnt++;
        return cnt;
    }
}