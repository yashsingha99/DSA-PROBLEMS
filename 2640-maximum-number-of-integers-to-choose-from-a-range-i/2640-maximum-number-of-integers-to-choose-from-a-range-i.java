class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for(int i : banned){
            set.add(i);
        }
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(set.contains(i)) continue;
            maxSum -= i;
            if(maxSum >= 0) ans++;
        }
        return ans;
    }
}