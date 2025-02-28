class Solution {
    int help(String str1, String str2, int i, int j, int[][] arr){
      if(i == 0 || j == 0) return 0;
      if(arr[i][j] != -1) return arr[i][j];
      if(str1.charAt(i - 1) == str2.charAt(j - 1)) 
        return arr[i][j] = 1 + help(str1, str2, i - 1, j - 1, arr);
      return arr[i][j] = Math.max(help(str1, str2, i - 1, j, arr), help(str1, str2, i, j - 1, arr));
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int arr[][] = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++)
           for(int j = 1; j <= m; j++)
             arr[i][j] = -1;

        int l = help(str1, str2, n, m, arr);

        int i = n, j = m;
        StringBuilder sb = new StringBuilder();
        while(i > 0 && j > 0){
          if(str1.charAt(i - 1) == str2.charAt(j - 1)){
            sb.insert(0, str1.charAt(i - 1));
            i--;j--;
          }
          else if((arr[i - 1][j] > arr[i][j - 1])){
            sb.insert(0, str1.charAt(i - 1));
            i--;
          }
          else {
            sb.insert(0, str2.charAt(j - 1));
            j--;
          }
        }
        while(i > 0){ sb.insert(0, str1.charAt( i - 1)); i--;}
        while(j > 0){ sb.insert(0, str2.charAt(j - 1)); j--;}
        return sb.toString();
    }
}