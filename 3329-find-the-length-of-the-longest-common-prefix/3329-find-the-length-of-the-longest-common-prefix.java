class TrieNode {
    TrieNode[] arr = new TrieNode[10];
    char dig;
}

class Solution {
    void insert(int num, TrieNode root) {
        TrieNode temp = root;
        String str = Integer.toString(num);
        for (char ch : str.toCharArray()) {
            int idx = ch - '0';
            if (temp.arr[idx] == null)
                temp.arr[idx] = new TrieNode();
            temp = temp.arr[idx];
        }
    }

    int search(int num, TrieNode root) {
        TrieNode temp = root;
        String str = Integer.toString(num);
        int cnt = 0;
        for (char ch : str.toCharArray()) {
            int idx = ch - '0';
            if (temp.arr[idx] != null) {
                cnt++;
                temp = temp.arr[idx];
            } else
                break;
        }
        return cnt;
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int ans = 0;
        TrieNode root = new TrieNode();
        for (int num : arr1) {
            insert(num, root);
        }
        for (int num : arr2) {
            ans = Math.max(ans, search(num, root));
        }
        return ans;
    }
}