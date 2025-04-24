class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length, res = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            set.add(i);
        }
        int completeSubLen = set.size();
        int i = 0, j = 0;
        while(j < n){
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while(completeSubLen == map.size()){
                res += (n - j);
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            } 
            j++;
            // System.out.println(map+" = "+res);
        }
        return res;
    }
}