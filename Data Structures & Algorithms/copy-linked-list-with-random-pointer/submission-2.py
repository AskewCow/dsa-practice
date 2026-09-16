"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        copyToNew = collections.defaultdict(lambda: Node(0))
        curr = head
        copyToNew[None] = None # prevents the end of the list to use the lambda function

        while curr:
            copyToNew[curr].val = curr.val
            copyToNew[curr].next = copyToNew[curr.next]
            copyToNew[curr].random = copyToNew[curr.random]
            curr = curr.next

        return copyToNew[head]