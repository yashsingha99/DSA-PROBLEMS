class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];
        int i = 0, j = 0, c = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ans[c++] = nums1[i++];
            } else {
                ans[c++] = nums2[j++];
            }
        }
        while(i < m) ans[c++] =  nums1[i++];
        while(j < n) ans[c++] =  nums2[j++];
        System.out.print(Arrays.toString(ans));
        for(int k = 0; k < m + n; k++)
          nums1[k] = ans[k];
        // return ans;
    }
}