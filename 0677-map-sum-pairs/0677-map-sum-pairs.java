class MapSum {
    Map<String, Integer> map;
    public MapSum() {
        map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        map.put(key, val);
    }
    
    public int sum(String pre) {
        int res = 0;
        for(String s : map.keySet()){
            if(s.indexOf(pre) == 0) res += map.get(s);
        }
        return res;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */