class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        int n1 = s1.length(), n2 = s2.length();
        List<String> list = new ArrayList<>();
        for(String s : s1.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);
        for(String s : s2.split(" "))
            map.put(s, map.getOrDefault(s, 0) + 1);
        for(String s : map.keySet()){
            if(map.get(s) == 1) list.add(s);
        }
        return list.toArray(new String[list.size()]);
    }
}