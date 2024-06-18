class Solution {
    public int maxProfitAssignment(int[] diff, int[] pro, int[] wor) {
        int n = diff.length, m = wor.length;
         int arr[][] = new int[n][2];
         for(int i = 0; i < n; i++){
            arr[i][0] = diff[i];
            arr[i][1] = pro[i];
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        // for(int i = 0; i < n; i++)
        // System.out.print(Arrays.toString(arr[i]));
        int res = 0;
        for(int i = 0; i < m; i++){
           for(int j = 0; j < n; j++){
              if(wor[i] >= arr[j][0]){
                 res += arr[j][1]; break;
              }
           }
        }
        return res;
    }
}