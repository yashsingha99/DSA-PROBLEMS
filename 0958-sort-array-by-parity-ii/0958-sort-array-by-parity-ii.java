class Solution {
    void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        int t = 0;
        while (i < n && j < n) {
            if ((i % 2) == (nums[i] % 2)) {
                i++;
                j++;
            } else {
                j = i + 1;
                t = (i % 2);
                while (j < n && (nums[j] % 2 != t))  j++;
                swap(nums, i, j);
                i++;
            }
        }
        if(i >= n) i = n - 1;
        if(j >= n) j = n - 1;
        swap(nums, i, j);
        return nums;
    }
}