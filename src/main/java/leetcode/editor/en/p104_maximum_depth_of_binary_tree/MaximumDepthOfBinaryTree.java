package leetcode.editor.en.p104_maximum_depth_of_binary_tree;

// P104_MaximumDepthOfBinaryTree

//leetcode submit region begin(Prohibit modification and deletion)

import leetcode.editor.en.utils.TreeNode;

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
    public int maxDepth(TreeNode root) {
        int level = 1;
        if (root.right != null) {
            level++;
            maxDepth(root.right);
        }
        return level;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
