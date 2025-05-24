// Reverse Chaining ()

class Solution{
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode nextNode = current.next;       // Save next node
            current.next = prev;                    // Reverse pointer
            prev = current;                         // Move prev forward
            current = nextNode;                     // MOve current forward
        }
        return prev;    // New head
    }
}