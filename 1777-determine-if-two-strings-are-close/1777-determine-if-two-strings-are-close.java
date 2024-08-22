class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1 = word1.length(), n2 = word2.length();
        if(n1 != n2) return false;
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        int dig[] = new int[100000];
        for(char c : word1.toCharArray()){
            if(word2.indexOf(c) == -1) return false;
            arr1[c - 'a']++;
        }
        for(char c : word2.toCharArray()){
            if(word1.indexOf(c) == -1) return false;
            arr2[c - 'a']++;
        }
        for(int i = 25; i >= 0; i--){
            dig[arr1[i]]++;
            dig[arr2[i]]--;
        }
        for(int i = 0; i < dig.length; i++)
           if(dig[i] != 0) return false;
        // for(int i = 25; i >= 0; i--){
        //     if(arr1[i] == 0 && arr2[i] == 0) break;
        //     if(arr1[i] != arr2[i]) return false;
        // }
        return true;
    }
}