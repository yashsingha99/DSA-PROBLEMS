class Solution {
    void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    void reverse(int[] nums, int i, int j){
        while(i <= j){
            swap(nums, i, j);
            i++; j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n == k) return;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
}