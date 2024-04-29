class Solution {
    public int minOperations(int[] nums, int k) {
        int num = 0, ans = 0;
        for(int n : nums){
            num ^= n;
        }
        while(k > 0 || num > 0){
           if((k % 2) != (num % 2))
             ans++;
            k /= 2;
            num /= 2;
        }
        return ans;
    }
}