class Solution {
    public int minCost(int[] nums1, int[] nums2) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums1.length;
        for (int i = 0; i < n; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
            map.put(nums2[i], map.getOrDefault(nums2[i], 0) - 1);
        }
        for(int val : map.values()){
            if(val % 2 != 0) return -1; 
            if(val > 0) res += val / 2;
        }
        return res;
    }
}