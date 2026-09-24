# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if self.sameTree(root, subRoot):
            return True
        
        if root.left:
            return self.isSubtree(root.left, subRoot)
        if root.right:
            return self.isSubtree(root.right, subRoot)
        
        return False

    def sameTree(self, q: Optional[TreeNode], r: Optional[TreeNode]):
        if not q and not r:
            return True

        if q and r and q.val == r.val:
            return self.sameTree(q.left, r.left) and self.sameTree(q.right, r.right)
        else:
            return False