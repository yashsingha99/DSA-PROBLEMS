class Solution {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < 32; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                count += ((nums[j] >> i) & 1);
            }
            res += count * (n - count) ;
        }
        return res;
    }
}