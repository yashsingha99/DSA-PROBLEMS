class Solution {
    boolean isPossible(int[] ranks, long mid, int cars) {
        long total = 0;
        for (int r : ranks) {
            total += Math.sqrt(1.0 * mid / r);
        }
        return total >= cars;
    }

    public long repairCars(int[] ranks, int cars) {
        long l = 1;
        long r = 1L * cars * cars * Arrays.stream(ranks).max().orElse(Integer.MIN_VALUE);

        while (l < r) {
            long mid = l + (r - l) / 2;

            if (isPossible(ranks, mid, cars)) {
                r = mid;
            } else
                l = mid + 1;
        }
        return l;
    }
}