class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, idx1 = 0, idx2 = 0;
        int[][] ans = new int[n / 3][];
        for (int i = 0; i < n - 2; i++) {
            if (nums[i + 1] - nums[i] > k || nums[i + 2] - nums[i + 1] > k || nums[i + 2] - nums[i] > k)
                return new int[][] {};

            ans[idx1++] = new int[] { nums[i], nums[i + 1], nums[i + 2] };
            i += 2;
        }
        return ans;
    }
}