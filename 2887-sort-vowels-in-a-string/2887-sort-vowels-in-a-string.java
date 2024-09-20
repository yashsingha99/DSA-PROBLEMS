class Solution {
    public String sortVowels(String s) {
        char[] c = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int n = c.length;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : c) {
            if (vowels.indexOf(ch) != -1)
                map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(c[i]) == -1)
                continue;
            for (char ch : vowels.toCharArray()) {
                if (map.containsKey(ch)) {
                    c[i] = ch;
                    map.put(ch, map.get(ch) - 1);
                    if (map.get(ch) == 0)
                        map.remove(ch);
                    break;
                }
            }

        }
        return new String(c);
    }
}