class Solution {
    public String removeOccurrences(String s, String part) {
        String str = s;
        int n = part.length(), len = s.length();
        while(str.indexOf(part) != -1){
            int idx = str.indexOf(part);
            // System.out.println(str+" "+ idx);

            if(idx == 0){
               str =  str.substring(idx + n);
            } else if(idx + n == len)
               str = str.substring(0, idx);
            else 
               str = str.substring(0, idx) + str.substring(idx + n);
            
        }
        return str;
    }
}