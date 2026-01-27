class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> l1 = new ArrayList<>();
        int d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
             l1.add(nums[i]);
            }
        }
        int c=0;
        for(Integer i:l1){
            nums[c++]=i;
        }
        return c;
    }
}