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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l2 = slow.next;
        slow.next = null;

        ListNode prev = null;
        while(l2 != null) {
            ListNode temp = l2.next;
            l2.next = prev;
            prev = l2;
            l2 = temp;
        }

        // Merge l1 & l2
        ListNode l1 = head;
        l2 = prev;

        while(l1 != null && l2 != null) {
            ListNode temp = l1.next;
            ListNode temp2 = l2.next;

            l1.next = l2;
            l2.next = temp;

            l1 = temp;
            l2 = temp2;
        }
    }
}
