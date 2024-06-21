class Solution {
    public int maxSatisfied(int[] cust, int[] gr, int min) {
        int n = cust.length;
        int max = -1, unstaisfied = 0, staisfied = 0;
        for(int i = 0; i < min; i++){
            if(gr[i] == 1)
             unstaisfied += cust[i];
            else staisfied += cust[i];
            max = Math.max(max, unstaisfied);
        }
        for(int i = min; i < n; i++){
            if(gr[i - min] == 1) 
               unstaisfied -= cust[i - min];
            if(gr[i] == 1)
             unstaisfied = (unstaisfied + cust[i]);
            else staisfied += cust[i];
            max = Math.max(max, unstaisfied);
        }
        return max + staisfied;
    }
}