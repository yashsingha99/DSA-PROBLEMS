class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
                cnt++;
            }
        }
        int ans[] = new int[n];
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0)
            ans[idx++] = nums[i];
        }
        return ans;
    }
}