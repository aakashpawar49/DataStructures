class Solution{
    public ListNode removeNthFromEnd(ListNode head, int n){
        int length = 0;
        ListNode temp = head;

        //Length
        while(temp != null){
            length++;
            temp = temp.next;
        }

        if(n == length){
            return head.next;
        }

        // Position
        temp = head;
        for(int i=1; i<length - n; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}