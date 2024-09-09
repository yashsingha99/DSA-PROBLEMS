class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        
        for (int[] row : arr) {
            Arrays.fill(row, -1);
        }

        ListNode temp = head;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (temp != null && top <= bottom && left <= right) {
            for (int i = left; i <= right && temp != null; i++) {
                arr[top][i] = temp.val;
                temp = temp.next;
            }
            top++; 
            
            for (int i = top; i <= bottom && temp != null; i++) {
                arr[i][right] = temp.val;
                temp = temp.next;
            }
            right--; 
            
            if (top <= bottom) {
                for (int i = right; i >= left && temp != null; i--) {
                    arr[bottom][i] = temp.val;
                    temp = temp.next;
                }
                bottom--; 
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top && temp != null; i--) {
                    arr[i][left] = temp.val;
                    temp = temp.next;
                }
                left++; 
            }
        }

        return arr;
    }
}
