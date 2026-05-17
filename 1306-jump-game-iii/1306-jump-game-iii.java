class Solution {
    public boolean canReach(int[] arr, int i) {
        if(i < 0 || i >= arr.length || arr[i] >= arr.length){
            return false;
        }

        int t = arr[i];
        arr[i] += arr.length;
        return t == 0 || canReach(arr, i + t) || canReach(arr, i - t);
    }
}