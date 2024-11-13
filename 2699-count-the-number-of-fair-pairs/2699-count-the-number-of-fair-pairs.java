class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return solve(nums, upper) - solve(nums, lower - 1);
    }

    long solve(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        long count = 0;
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else {
                count += (j - i);
                i++;
            }
        }
        return count;
    }
}