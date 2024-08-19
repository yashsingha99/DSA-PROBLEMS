class Solution {
    int highestFactor(int n){
        int sq = (int) Math.sqrt(n);
        for(int i = n / 2; i > 1; i--){
            if (n % i == 0) {
                // if (i != n) {
                    // return n / i; 
                // }
                return i;
            }
        }
        return n;
    }
    public int minSteps(int n) {
        if(n <= 1) return 0;
        if(n <= 3) return n;
        int num = highestFactor(n);
        if(num == n)
           return num;
        return (n / num) + minSteps(num);
    }
}