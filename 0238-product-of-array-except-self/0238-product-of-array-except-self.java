class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        int cnt = nums[0];
        for(int i = 1; i < n; i++){
           ans[i] = cnt;
           cnt *= nums[i];
        }
        cnt = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            ans[i] *= cnt;
            cnt *= nums[i];
        }
 
        return ans;
    }
}