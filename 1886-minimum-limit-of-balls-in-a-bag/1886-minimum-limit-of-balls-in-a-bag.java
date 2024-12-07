class Solution {
    int check(int[] nums, int tar) {
        int cnt = 0;
        for (int i : nums) {
            int op = (i / tar);
            if (i % tar == 0) {
                cnt += op - 1;
            } else
                cnt += op;
        }
        return cnt;
    }

    public int minimumSize(int[] nums, int maxCnt) {
        int max = -1;
        for (int i : nums) {
            max = Math.max(max, i);
        }
        int l = 1, r = max, ans = 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int cnt = check(nums, mid);
            if (cnt <= maxCnt) {
                r = mid - 1;
                ans = mid;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}