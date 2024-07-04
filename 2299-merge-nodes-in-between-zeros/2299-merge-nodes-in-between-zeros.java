class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode ans  = new ListNode(0);  
        ListNode res  = ans;         
        ListNode temp = head.next;       
        int cnt = 0;                                         
        while(temp != null){           
           if(temp.val == 0){                 
               res.next = new ListNode(cnt);
               res = res.next; 
               cnt = 0; 
            }  
           cnt += temp.val;
           System.out.print(cnt+" ");
           temp = temp.next;
        }
        return ans.next;
    }
}