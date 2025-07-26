class Solution {
    ListNode help(ListNode cur, ListNode prev, ListNode next){
        if(cur == null) return prev;
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        return help(cur, prev, next);
    }

    public ListNode reverseList(ListNode head) {
        return help(head, null, null);
    }
}