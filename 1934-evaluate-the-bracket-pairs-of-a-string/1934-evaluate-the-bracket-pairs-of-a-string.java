class Solution {
    public String evaluate(String s, List<List<String>> kn) {
        Map<String, String> map = new HashMap<>();
        for(List<String> ls : kn){
            if(!map.containsKey(ls.get(0)))
               map.put(ls.get(0), ls.get(1));
        }
        // System.out.print(map);
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
           if(s.charAt(i) == '('){
            int j = i + 1;
            while(s.charAt(j) != ')')j++;
            String sub = s.substring(i + 1, j);
            if(!map.containsKey(sub))
              sb.append('?');
            else
            sb.append(map.get(sub));
            i = j;
           } else
            sb.append(s.charAt(i)); 
        }
        return sb.toString();
    }
}