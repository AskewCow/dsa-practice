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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;

        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        if(size-n == 0) return head.next;

        temp = head;
        int index = size - n;
        for(int i = 0; i < size; i++) {
            if(i+1 == index) {
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
}
