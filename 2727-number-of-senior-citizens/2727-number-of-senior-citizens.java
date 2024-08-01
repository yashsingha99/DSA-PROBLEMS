class Solution {
    public int countSeniors(String[] det) {
        int cnt = 0, n = det.length;
        for(int i = 0; i < n; i++){
            char age1 = det[i].charAt(11);
            char age2 = det[i].charAt(12);
            int diff = (age1 - '6' ) + (age2 - '0' );
           if(age1 - '6' > -1 && diff > 0) cnt++;
        }
        return cnt;
    }
}