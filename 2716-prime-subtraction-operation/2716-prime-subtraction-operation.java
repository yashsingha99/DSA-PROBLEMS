class Solution {
    public boolean primeSubOperation(int[] nums) {
        boolean[] primes = new boolean[1001];
        primes[0] = false;
        primes[1] = false;
        Arrays.fill(primes, true);
        for (int i = 2; i * i < 1000; i++) {
            if(primes[i])
            for (int j = i * i; j < 1000; j += i)
                primes[j] = false;
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1])
                continue;
            for (int j = 2; j < nums[i]; j++) {
                if (primes[j] && nums[i] - j < nums[i + 1]) {
                    nums[i] -= j;
                    break;
                }
            }
            if (nums[i] >= nums[i + 1])
                return false;
        }
        return true;
    }
}