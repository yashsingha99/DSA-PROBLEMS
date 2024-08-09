class Solution {
    public int compress(char[] chars) {
        int cnt = 0;
        char ch = chars[0];
        String str = "";
        for (char c : chars) {
            if (ch == c) {
                cnt++;
            } else {
                if(cnt > 1)
                 str += (ch+"" + cnt);
                else 
                 str += ch+"";
                cnt = 1;
            }
            ch = c;
        }
        if(cnt > 1)
         str += (ch+"" + cnt);
        else 
         str += ch+"";
        char[] temp  = str.toCharArray();
        for(int i = 0; i < temp.length; i++){
            chars[i] = temp[i];
        }
        return temp.length;
    }
}