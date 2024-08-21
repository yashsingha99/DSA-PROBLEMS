class Solution {
    public String orderlyQueue(String s, int k) {
        int n = s.length();
        if(k == 1){
            String ans = s;
            for(int i = 0; i < n; i++){
               String temp = s.substring(i + 1) + s.substring(0, i + 1); 
               if(temp.compareTo(ans) < 0){
                 ans = temp;
               }
            }
            return ans;
        }
        char[] str= s.toCharArray();
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
          sb.append(str[i]);
        return sb.toString();
    }
}