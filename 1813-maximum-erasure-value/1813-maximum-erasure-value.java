class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i = 0, j = 0, n = nums.length, max = -1, cnt = 0;
        Set<Integer> set = new HashSet<>();
        while (j < n) {
            cnt += nums[j];
            while (i < j && set.contains(nums[j])) {
                set.remove(nums[i]);
                cnt -= nums[i++];
            }
            set.add(nums[j]);
            max = Math.max(max, cnt);
            j++;
        }
        return max;
    }
}