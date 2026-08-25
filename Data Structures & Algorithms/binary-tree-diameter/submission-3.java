/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[1];
        diameterOfBinaryTree(root, res);
        return res[0];
    }

    private int diameterOfBinaryTree(TreeNode node, int[] res) {
        if(node == null) return 0;

        int left = diameterOfBinaryTree(node.left, res);
        int right = diameterOfBinaryTree(node.right, res);

        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left, right);
    }
}
