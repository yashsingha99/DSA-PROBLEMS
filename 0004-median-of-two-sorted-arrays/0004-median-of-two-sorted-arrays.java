class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length; 
        int arr[] = new int[n + m], idx1 = 0, idx2 = 0, idx = 0;
        while(idx1 < n && idx2 < m){
            if(nums1[idx1] < nums2[idx2]){
                arr[idx++] = nums1[idx1++]; 
            }
            else arr[idx++] = nums2[idx2++];
        }
        while( idx1 < n) arr[idx++] = nums1[idx1++]; 
             
        while(idx2 < m)  arr[idx++] = nums2[idx2++];

        if((n + m) % 2 != 0 ) return (double) arr[(n + m)/2];
        else return (double) (arr[(n + m)/2] + arr[((n + m)/2)-1])/2;

    }
}