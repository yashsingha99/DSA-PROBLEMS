class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1, min = Integer.MAX_VALUE;
        for(int i : nums){
            if(min < i){
                max = Math.max(max, (i - min));
            } else {
                min = i;
            }
        }
        return max;
    }
}