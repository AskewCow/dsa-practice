/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldToCopy = new HashMap<>();

        Node temp = head;
        while(temp != null) {
            oldToCopy.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;
        Node curr = oldToCopy.get(head);
        while(temp != null) {
            curr.next = oldToCopy.get(temp.next);
            curr.random = oldToCopy.get(temp.random);
            temp = temp.next;
            curr = curr.next;
        }

        return oldToCopy.get(head);
    }
}
