import java.util.ArrayList;

public class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

class Solution{
    public ListNode reverseList(ListNode head){
        ArrayList<Integer> values = new ArrayList<>();
        
        ListNode current = head;
        while(current != null){
            values.add(current.val);     // Store values
            current = current.next;
        }

        current = head;
        for(int i=values.size() - 1; i>=0; i--){
            current.val = values.get(i);   // Reassign in reverse
            current = current.next;
        }
        return head;
    }
}


// Complexity is O(N) 
// Brute force approach using ArrayList/Stack