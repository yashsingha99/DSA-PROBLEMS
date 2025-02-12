class Solution {
    public int maximumSum(int[] nums) {
        int[] arr = new int[100];
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int cnt = sum(num);
            if (arr[cnt] != 0)
                ans = Math.max(ans, arr[cnt] + num);
            arr[cnt] = Math.max(arr[cnt], num);
        }
        return ans;
    }

    int sum(int num) {
        int cnt = 0;
        while (num != 0) {
            cnt += (num % 10);
            num /= 10;
        }
        return cnt;
    }
}