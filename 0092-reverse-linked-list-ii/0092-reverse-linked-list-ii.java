class Solution {
    public ListNode rev(ListNode node,int h,int l){
      ListNode curr = node;
      ListNode prev = null;
      while( h-- > l )
      {
          ListNode Next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = Next;
      }
      if(curr.next != null){
          ListNode temp = curr.next;
          node.next = temp;
      }
      curr.next = prev;
       
       return curr;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null|| left == right) return head;
        ListNode first = head;
        ListNode last =  head;
        ListNode prev = head;
        int idx = 1;
        while(idx < left){
             first = first.next;
             if(idx++ > 1){
              prev = prev.next;
             }
        }
        if(left == 1){
            return rev(first, right, left);
        }
        prev.next = rev(first, right, left);
        return head;
    }
}