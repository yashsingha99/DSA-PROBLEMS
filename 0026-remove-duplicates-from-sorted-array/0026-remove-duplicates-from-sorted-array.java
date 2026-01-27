class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1, j = 0, n = nums.length;
        while(i < n && j < n - 1){
            if(nums[j] == nums[j + 1]){j++; continue;}
            nums[i++] = nums[j + 1];
            j++;
        }
        return i;
    }   
}