class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt = 0;
        for(int i : arr){
            if(i % 2 != 0) cnt++;
            else cnt = 0;
            if(cnt == 3) return true;;
        }
        return false;
    }
}