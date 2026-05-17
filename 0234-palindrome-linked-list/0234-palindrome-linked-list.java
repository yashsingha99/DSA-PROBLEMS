class Solution {
    ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    boolean check(ListNode head, ListNode revList){
        while(revList != null){
            if(head.val != revList.val) return false;
            head = head.next;
            revList = revList.next;
        }
        return true;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode midList = mid(head);
        ListNode revList = rev(midList.next);
        return check(head, revList);
    }
}