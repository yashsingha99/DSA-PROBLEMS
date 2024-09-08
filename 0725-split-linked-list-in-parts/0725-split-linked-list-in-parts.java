class Solution {
    int size(ListNode head) {
        if (head == null)  return 0;
        return 1 + size(head.next);
    }
    
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = size(head); 
        ListNode[] ans = new ListNode[k];
        int part = size / k;
        int extra =  size % k;
        ListNode temp = head;
        for(int i = 0; i < k; i++){
            ans[i] = temp;
            int cycle = part + (extra > 0 ? 1 : 0);
            extra--;
            for(int j = 0; j < cycle - 1 && temp != null; j++) temp = temp.next;
             if(temp != null){
                ListNode nextPart = temp.next;
                temp.next = null;
                temp = nextPart;   
             }
        }
        return ans;
    }
}