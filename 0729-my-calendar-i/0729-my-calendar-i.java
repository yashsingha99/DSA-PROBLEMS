class MyCalendar {
    List<List<Integer>> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int s, int e) {
        for (List<Integer> l : list) {
            int le = l.get(0), r = l.get(1);
            if(le < e && r > s) {
               return false;
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(s);
        ans.add(e);
        list.add(ans);
        return true;
    }
}
