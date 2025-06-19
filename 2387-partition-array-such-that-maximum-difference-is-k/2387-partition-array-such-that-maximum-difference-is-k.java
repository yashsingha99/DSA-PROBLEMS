class Solution {
    public int partitionArray(int[] nums, int k) {
        int maxE = Arrays.stream(nums).max().getAsInt();
        int[] fq = new int[maxE + 1];

        for(int i : nums){
            fq[i]++;
        }
        int max = -1, min = maxE, ans = 0;
        for(int i = 0; i <= maxE; i++){
            if(fq[i] == 0) continue;
            max = Math.max(max, i);
            min = Math.min(min, i);
            if(max - min > k) {
                ans++; max = i; min = i;
            }
        }
        return ans + 1;
    }
}