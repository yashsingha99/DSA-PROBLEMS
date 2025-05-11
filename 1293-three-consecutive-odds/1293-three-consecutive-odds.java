class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length, cnt = 0;
       for(int i = 0; i < n; i++){
        if((arr[i] % 2) != 0) cnt++;
        else cnt = 0;
        // System.out.print(cnt+" ");
        if(cnt == 3) return true;
       }
       return false;
    }
}