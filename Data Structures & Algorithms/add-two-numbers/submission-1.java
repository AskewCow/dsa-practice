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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        boolean carry = false;

        while(l1 != null || l2 != null || carry == true) {
            int sum = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            } 
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if(carry) {
                sum += 1;
                carry = false;
            }

            if(sum > 9) {
                carry = true;
                sum %= 10;
            }
            
            prev.next = new ListNode(sum);
            prev = prev.next;
        }
        return dummy.next;
    }
}
