class Solution{
    public ListNode middleNide(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        // Fast moves 2 steps and slow moves 1 step
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // When loop ends, slow is at middle
        return slow;
    }
}