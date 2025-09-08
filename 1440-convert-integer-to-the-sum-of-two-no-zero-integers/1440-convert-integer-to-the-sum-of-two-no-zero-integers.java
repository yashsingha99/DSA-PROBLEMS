class Solution {
    boolean nonZero(int num){
        while(num != 0){
            if(num % 10 == 0) return false;
            num /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        for(int i = 1; i <= n - 1; i++){
            if(nonZero(i) && nonZero(n - i)){
                return new int[]{i, n - i};
            }
        }
        return new int[]{-1, -1};
    }
}