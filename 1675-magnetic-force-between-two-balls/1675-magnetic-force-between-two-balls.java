class Solution {
    boolean isPossible (int magn, int[] pos, int m) {
        int prev =  pos[0], curr = 1;
        for(int i = 1; i < pos.length; i++){
            if(pos[i] - prev >= magn){
                prev = pos[i];
                curr++;
            }
        }
        return m <= curr;
    }
    public int maxDistance(int[] pos, int m) {
        int n = pos.length, ans = -1;
      
        Arrays.sort(pos);
        int low = 1;
        int high = (pos[n-1] - pos[0]) / (m - 1);
      
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(isPossible(mid, pos, m)){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}