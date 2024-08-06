class Solution {
    public int minimumPushes(String word) {
        int arr[] = new int[26], pos = 1, cnt1 = 1, cnt2 = 1, res = 0;
        System.out.println(word.length());
        for(char c : word.toCharArray()){
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        for(int i = 25; i >= 0; i--){
            if(arr[i] == 0) continue;
            if(cnt1 > 8 * cnt2){ 
               pos++; 
               cnt2++;
            }
            cnt1++;
            res += (pos * arr[i]);
        }
        
        return res;
    }
}