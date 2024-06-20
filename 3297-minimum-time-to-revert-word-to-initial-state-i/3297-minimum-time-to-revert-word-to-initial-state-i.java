class Solution {
    public int minimumTimeToInitialState(String s, int k) {
        int i = k, n = s.length(), cnt = 1;
        while(i < n){
            int left = n - i;
            if(s.substring(0, left).equals(s.substring(i, n)))
               break;
            cnt++;
            i += k;
        }
        return cnt++;
    }
}