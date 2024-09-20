class Solution {
    public String sortVowels(String s) {
        char[] c = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int n = c.length;
        List<Character> list = new ArrayList<>();
        for(int i = 0;  i < n; i++){
           if(vowels.indexOf(c[i]) != -1)
               list.add(c[i]);
        }
        Collections.sort(list);
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(vowels.indexOf(c[i]) != -1)
               c[i] = list.get(idx++);
        }
        return new String(c);
    }
}