class Solution {
    public String intToRoman(int num) {
     int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
     String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","V","IV","I"};
     StringBuilder sb = new StringBuilder();
     while(num > 0){
         int temp = 0;
        for(int i = 12; i >= 0; i--){
           if(num < val[i]){
              temp = i + 1;
              break;
           }
        }

        int times = num / val[temp];
        for(int i = 0; i < times; i++)
          sb.append(sym[temp]);
        num %= val[temp];
     }
     return sb.toString();
    }
}