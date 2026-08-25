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
        Map<Node, Node> oldToNew = new HashMap<>();
        oldToNew.put(null, null);
        Node tmp = head;

        while(tmp != null) {
            Node newNode = new Node(tmp.val);
            oldToNew.put(tmp, newNode);
            tmp = tmp.next;
        }

        tmp = head;
        while(tmp != null) {
            Node node = oldToNew.get(tmp);
            node.next = oldToNew.get(tmp.next);
            node.random = oldToNew.get(tmp.random);
            tmp = tmp.next;
        }

        return oldToNew.get(head);
    }
}
