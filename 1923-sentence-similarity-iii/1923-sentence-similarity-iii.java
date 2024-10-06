class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        String[] t1 = s1.split(" ");
        String[] t2 = s2.split(" ");
        int i = 0, j = t1.length - 1, k = 0, l = t2.length - 1;
        while(i <= j && k <= l){
           if(!t1[i].equals(t2[k])) break;
           i++;k++;
        }
        while(i <= j && k <= l){
           if(!t1[j].equals(t2[l])) break;
           j--;l--;
        }
        return i > j || k > l;
    }
}