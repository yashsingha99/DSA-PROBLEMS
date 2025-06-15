class Solution {
    public int maxDiff(int num) {
        String s1 = Integer.toString(num);
        int pos1 = 0, pos2 = 0;
        int n = s1.length();
        for(int i = 0; i < n; i++){
            if(s1.charAt(i) < '9'){
                pos1 = i; break;
            } 
        }
        for(int i = 0; i < n; i++){
           if(s1.charAt(i) > '1'){
                pos2 = i; break;
            }
            
        }
        int num1 = 0, num2 = 0;
        if(s1.charAt(0) == '1'){
            char targetChar = s1.charAt(pos2);
            if(pos2 == 0){
               num1 = Integer.parseInt(s1.replace(targetChar, '1'));
            } else {
               num1 = Integer.parseInt(s1.replace(targetChar, '0'));
            }
        }else{
            char targetChar = s1.charAt(0);
            num1 = Integer.parseInt(s1.replace(targetChar, '1'));
        }
        
        char targetChar = s1.charAt(pos1);
        num2 = Integer.parseInt(s1.replace(targetChar, '9'));
        return num2 - num1;
    }
}