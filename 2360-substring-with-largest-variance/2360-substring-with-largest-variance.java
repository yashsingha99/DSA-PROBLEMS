class Solution {
    public int largestVariance(String s) {
        int n = s.length(), res = 0;
        int[] fq = new int[26];
        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray())  fq[c - 'a']++;
            //    list.add(c);
        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 'a'; j <= 'z'; j++) {
                if(fq[i - 'a'] == 0 || fq[j - 'a'] == 0) continue;
                int firstC = 0, secondC = 0;
                int isSecond = 0;
                for(char c : s.toCharArray()){
                   if(i == c) firstC++;
                   if(j == c) secondC++;
                   if(secondC > 0) res = Math.max(res, firstC - secondC);
                   else if(isSecond == 1) res = Math.max(res, firstC - 1);
                   if(firstC < secondC){
                      isSecond = 1;
                      firstC = 0;
                      secondC = 0;
                   } 
                }
            }
        }
        return res;
    }
}