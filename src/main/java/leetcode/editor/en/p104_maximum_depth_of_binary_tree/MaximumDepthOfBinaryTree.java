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
    int level = 1;
    public int maxDepth(TreeNode root) {
        if (root.right != null) {
            level++;
            maxDepth(root.right);
        } else if (root.left != null) {
            level++;
            maxDepth(root.left);
        }
        return level;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
