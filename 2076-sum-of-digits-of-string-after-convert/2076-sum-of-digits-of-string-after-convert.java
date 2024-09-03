class Solution {
    public int getLucky(String s, int k) {
        String ans = "";
        for(char c : s.toCharArray()){
           ans += (c - 'a') + 1;
        }
        int temp = 0;
        while(k-- > 0){
            temp = 0;
            for(char c : ans.toCharArray())
                 temp += (c - '0');
            ans = temp + "";
        }
        return temp;
    }
}