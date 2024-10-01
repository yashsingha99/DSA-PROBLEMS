class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] count = new int[k];
        for(int i : arr){
            int rem = ((i % k) + k) % k;
            count[rem]++;
        }
        if(count[0] % 2 != 0) return false;
        for(int i = 1; i <= k / 2; i++){
            if(count[k - i] != count[i]) return false;
        }
        return true;
    }
}