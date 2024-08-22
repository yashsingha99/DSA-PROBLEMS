class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length, len = strs[0].length(), cnt = 0;
        for(int i = 0; i < len; i++){
            char max = 'a';
           for(int j = 0; j < n; j++){
            char ch = strs[j].charAt(i);
             if(max <= ch){
                max = ch;
             } else {
                cnt++; break;
             }
            //  System.out.print(max+" ");
           }
            // System.out.println();
        }
        return cnt;
    }
}