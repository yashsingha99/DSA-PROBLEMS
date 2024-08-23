class Solution {
    int gcd(int val1, int val2){
        if(val1 == 0) return val2;
        return gcd(val2 % val1, val1);
    }
    public String fractionAddition(String e) {
        int upper = 0, lower = 1, n = e.length(), i = 0;
        while(i < n){
            boolean negNum = (e.charAt(i) == '-');
            if(e.charAt(i) == '-' || e.charAt(i) == '+')
               i++;
            int prev = i;
            while(Character.isDigit(e.charAt(i))) i++;
            int currVal1 = Integer.parseInt(e.substring(prev, i));
            if(negNum) currVal1 *= -1;
            i++;
            prev = i;
            while(i < n && Character.isDigit(e.charAt(i))) i++;
            int currVal2 = Integer.parseInt(e.substring(prev, i));
            
           upper = upper * currVal2 + lower * currVal1;
           lower = currVal2 * lower;
        }
       
       int gcdVal = Math.abs(gcd(upper, lower));
       return (upper / gcdVal) + "/"+ (lower / gcdVal);
    }
}