class Solution {
    Map<String, Boolean> map = new HashMap<>();

    boolean isConcatenated(String word, Set<String> st) {
        if (map.containsKey(word))
            return map.get(word);
        int n = word.length();
        for (int i = 0; i < n; i++) {
            String prefix = word.substring(0, i + 1);
            String suffix = word.substring(i + 1);
            if ((st.contains(prefix) && isConcatenated(suffix, st))
                    || (st.contains(suffix) && st.contains(prefix))) {
                map.put(word, true);
                return true;
            }
        }
        map.put(word, false);
        return false;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        int n = words.length;
        List<String> res = new ArrayList<>();
        Set<String> st = new HashSet<>();
        for (String s : words)
            st.add(s);
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (isConcatenated(word, st))
                res.add(word);
        }
        return res;
    }
}