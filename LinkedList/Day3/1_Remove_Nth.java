class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        //Move fast n+1 steps so slow ends up just before node to delete
        for(int i=0; i<=n; i++){
            fast = fast.next;
        }

        //Move both the pointers
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //Skip target node
        slow.next = slow.next.next;

        return dummy.next;
    }
}