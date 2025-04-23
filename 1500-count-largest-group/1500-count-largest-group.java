class Solution {
    int getSum(int num){
        int s = 0;
        while(num != 0){
            s += (num % 10);
            num /= 10;
        }
        return s;
    }
    public int countLargestGroup(int n) {
         int[] arr = new int[n + 1];
         int max = -1, cnt = 0;
         for(int i = 1; i <= n; i++){
            int sum = getSum(i);
            arr[sum]++;
            max = Math.max(max, arr[sum]);
         }
         for(int i : arr) if(i == max) cnt++;
          return cnt;
    }
}