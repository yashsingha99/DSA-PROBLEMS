class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] arr = new int[limit + 1];
        for(int wt : people){
            arr[wt]++;
        }
        int i = 0, j = limit, boats = 0;
        while(i <= j){
            if(arr[i] <= 0) i++;
            else if(arr[j] <= 0) j--;
            else if(i + j <= limit) {
                arr[i]--;
                arr[j]--; 
                boats++;
            } else {
                arr[j]--;
                boats++;
            }
        } 
        return boats;
    }
}