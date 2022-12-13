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
    int levelA = 1;
    int levelB = 1;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right != null) {
            levelA++;
            maxDepth(root.right);
        } else if (root.left != null) {
            levelA++;
            maxDepth(root.left);
        }

        if (root.left != null) {
            levelB++;
            maxDepth(root.left);
        } else if (root.right != null) {
            levelB++;
            maxDepth(root.right);
        }
        return Math.max(levelA, levelB);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
