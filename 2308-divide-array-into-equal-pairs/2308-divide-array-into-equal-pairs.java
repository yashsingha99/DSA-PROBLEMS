class Solution {
    public boolean divideArray(int[] nums) {
        int[] fq = new int[501];
        for(int i : nums){
            fq[i]++;
        }
        for(int i = 0; i < 501; i++){
            if(fq[i] % 2 != 0) return false;
        }
        return true;
    }
}