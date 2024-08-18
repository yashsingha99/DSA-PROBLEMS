class Solution {
    // public boolean isUgly(int n) {
    //     if (n <= 0)
    //         return false;
    //     while (n % 2 == 0)
    //         n /= 2;
    //     while (n % 3 == 0)
    //         n /= 3;
    //     while (n % 5 == 0)
    //         n /= 5;
    //     return n == 1;
    // }

    public int nthUglyNumber(int n) {
        int num = 1, cnt = 1;
        int l1 = 0, l2 = 0, l3 = 0;
        List<Integer> uglyArr = new ArrayList<>();
        uglyArr.add(1);
        for (int i = 0; i < n; i++) {
            int t1 = uglyArr.get(l1) * 2;
            int t2 = uglyArr.get(l2) * 3;
            int t3 = uglyArr.get(l3) * 5;
            int min = Math.min(t1, Math.min(t2, t3));
            uglyArr.add(min);
            if(t1 == min){
                l1++;
            }
            if(t2 == min){
                l2++;
            }
            if(t3 == min){
                l3++;
            }
        }
        return uglyArr.get(n - 1);
    }
}