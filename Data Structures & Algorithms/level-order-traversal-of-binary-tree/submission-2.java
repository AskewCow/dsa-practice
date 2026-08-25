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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();

                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);

                level.add(temp.val);
            }
            res.add(level);
        }
        return res;
    }
}
