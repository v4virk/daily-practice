//remove the centre of the linked list 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre_slow = null;


        while(fast != null && fast.next != null){
            pre_slow = slow;
            slow = slow.next;
            fast = fast.next.next;

            
        }

        if(pre_slow == null){
            return null;
        }
        pre_slow.next = slow.next;
        return head;
        
    }
}