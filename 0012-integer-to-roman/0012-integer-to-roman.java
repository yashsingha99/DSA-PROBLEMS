class Solution {
    void convert(int num, int[] val, String[] sym, StringBuilder sb){
        if(num == 0) return;
        // System.out.print(num+" ");
        int temp = 0;
        for(int i = 12; i >= 0; i--){
           if(num < val[i]){
              temp = i + 1;
              break;
           }
        }
        // System.out.print(temp+" ");

        int times = num / val[temp];
        for(int i = 0; i < times; i++)
          sb.append(sym[temp]);
        convert(num % val[temp], val, sym, sb);
    }
    public String intToRoman(int num) {
     int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
     String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX","V","IV","I"};
     StringBuilder sb = new StringBuilder();
     convert(num, val, sym, sb);
     return sb.toString();
    }
}