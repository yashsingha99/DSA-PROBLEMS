class Solution {
    public String replaceWords(List<String> dic, String sen) {
        int n = dic.size();
        String[] sent = sen.split(" ");
        Collections.sort(dic , (a, b) -> Integer.compare(a.length() , b.length()));
        int m = sent.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sent[i].length() > dic.get(j).length()
                        && sent[i].substring(0, dic.get(j).length()).equals(dic.get(j))) {
                    sent[i] = dic.get(j);
                    break;
                }
            }
        }
        return String.join(" ", sent);
    }
}