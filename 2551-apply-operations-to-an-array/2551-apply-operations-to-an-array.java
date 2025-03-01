class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums;
        int res[] = new int[n], c = 0, zero = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 0)
                continue;
            if (nums[i] == nums[i + 1])
                res[c++] = nums[i++] * 2;
            else res[c++] = nums[i];
        }
        if (nums[n - 1] != nums[n - 2])
            res[c] = nums[n - 1];
        return res;
    }
}