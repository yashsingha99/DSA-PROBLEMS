class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n < 3) return false;
        String vow = "aeiouAEIOU";
        String dig = "1234567890";
        int cntV = 0, cntC = 0, cntD = 0;
        for(char ch : word.toCharArray()){
            if(vow.indexOf(ch+"") != -1) cntV++;
            else if(dig.indexOf(ch+"") != -1) cntD++;
            else if((ch >='a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) cntC++;
        }
        // System.out.print(cntD + cntC + cntV);
        return cntV >= 1 && cntC >= 1 && cntD + cntC + cntV == n;
    }
}