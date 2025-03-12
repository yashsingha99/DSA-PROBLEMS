class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int pos = binarySearch(nums, 1);
        int neg = binarySearch(nums, 0);
        return Math.max(neg, n - pos);
    }

    int binarySearch(int[] nums, int sign){
      int s = 0, e = nums.length;
      while(s < e){
        int mid = (e + s) / 2;
        if(nums[mid] < sign) s = mid + 1;
        else e = mid;
      }
      return s;
    }
}