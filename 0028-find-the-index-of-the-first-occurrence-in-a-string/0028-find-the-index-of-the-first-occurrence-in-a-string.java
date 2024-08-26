class Solution {
    public int strStr(String h, String n) {
        int lenH = h.length(), lenN = n.length();
        if(h.equals(n)) return 0;
        for(int i = 0; i < lenH; i++){
            if(i + lenN <= lenH && h.substring(i, lenN + i).equals(n))  
              return i;
        }
        return -1;
    }
}