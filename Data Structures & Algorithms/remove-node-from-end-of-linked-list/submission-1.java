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

        ListNode tmp = head;
        while(tmp != null) {
            tmp = tmp.next;
            size++;
        }

        int index = size - n;
        if(index == 0) return head.next;

        tmp = head;
        for(int i = 0; i < size-1; i++) {
            if((i+1) == index) {
                tmp.next = tmp.next.next;
                break;
            }
            tmp = tmp.next;
        }
        return head;
    }
}
