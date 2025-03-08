class Solution {
    public int minimumRecolors(String s, int k) {
       int cnt = 0;
       int n = s.length(), min = n;
       for(int i = 0; i < k; i++){
             if(s.charAt(i) == 'W') cnt++;
       }   
    //    if(cnt <= 1) return cnt;
       min = Math.min(min, cnt);
       for(int i = k; i < n; i++){
           if( s.charAt(i) == 'W') cnt++; 
           if( s.charAt(i - k) == 'W') cnt--;
           min = Math.min(min, cnt);
       }
       return min;
    }
}