class Solution {
    public int[] getFinalState(int[] nums, int k, int mul) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[0] == b[0])
              return a[1] - b[1];
            else 
              return a[0] - b[0];
        });
        for(int i = 0; i < nums.length; i++){
            pq.add(new int[]{nums[i], i});
        }
        while(k-- > 0){
           int[] arr = pq.poll();
           arr[0] *= mul;
           pq.add(arr);
           nums[arr[1]] *= mul;
        }
        return nums;
    }
}