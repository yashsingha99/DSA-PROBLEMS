class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        if(n < 4) return list;
        Arrays.sort(nums);
        for(int h = 0; h < n; h++){
            if(h > 0 && nums[h] == nums[h-1]) continue;
        for(int i = h+1; i < n; i++){
            if(i != (h+1) && nums[i] == nums[i-1]) continue;
            int j = i+1, k = n-1;
            while(j < k){
              long sum = nums[h] ;
              sum += nums[i];
              sum += nums[j];
              sum += nums[k];
              if(sum < target) j++;
              else if(sum > target) k--;
              else {
                  list.add(new ArrayList<>(Arrays.asList(nums[h], nums[i], nums[j],nums[k])));
                  j++; k--;
                   while(j < n && nums[j] == nums[j-1]) j++;
                   while(k > 0 && nums[k] == nums[k+1]) k--;
              }
            }
        }
        }
        return list;
    }
}