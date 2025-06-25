class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1, n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = 1;
        int cnt = nums[0];
        for(int i = 1; i < n; i++){
           pre[i] = cnt;
           cnt *= nums[i];
        }
        cnt = nums[n - 1];
        suf[n - 1] = 1;
        for(int i = n - 2; i >= 0; i--){
            suf[i] = cnt;
            cnt *= nums[i];
        }

        int[] ans = new int[n];
        for(int i= 0; i < n; i++){
            ans[i] = suf[i] * pre[i];
        }

        // System.out.println(Arrays.toString(pre));
        // System.out.print(Arrays.toString(suf));
        return ans;
    }
}