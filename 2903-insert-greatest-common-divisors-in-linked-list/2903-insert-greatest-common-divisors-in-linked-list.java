class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode Next = head.next;
        while(Next != null){
            int gc = gcd(temp.val, Next.val);
            ListNode node = new ListNode(gc);
            temp.next = node;
            node.next = Next;
            temp = Next;
            Next = Next.next;
        }
        return head;
    }
   int gcd(int a, int b) {
    if (b == 0) 
        return a;
    return gcd(b, a % b);
}
}