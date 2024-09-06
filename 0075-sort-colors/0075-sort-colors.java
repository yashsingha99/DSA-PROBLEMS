class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0, n = nums.length;
        for(int i : nums){
            if(i == 0) zero++;
            else if(i == 1) one++;
            else two++;
        }
        for(int i = 0; i < n; i++){
         if(zero > 0){
            nums[i] = 0; zero--;
         }
         else if(one > 0){
            nums[i] = 1; one--;
         }
         else{
            nums[i] = 2; two--;
         }
        }
        // return nums;
    }
}