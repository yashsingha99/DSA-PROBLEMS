class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length, idx = 0, max = -1;
        int ans[] = new int[n];
        for(int i : arr1)
          max = Math.max(i, max);
        int freq[] = new int[max + 1];
        for(int i : arr1)
          freq[i]++;
        for(int i : arr2){
            while(freq[i] != 0 ){
                freq[i]--;
                ans[idx++] = i; 
            }
        }
        for(int i = 0; i <= max; i++){
            while(freq[i] != 0 ){
                ans[idx++] = i; 
                freq[i]--;
            }
        }
        return ans;
    }
}