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
    int rightLevel = 1;
    int leftLevel = 1;
    public int maxDepth(TreeNode root) {
        int a = right(root);
        int b = left(root);
        return Math.max(a, b);
    }

    public int right(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.right != null) {
            rightLevel++;
            right(root.right);
        } else if (root.left != null) {
            rightLevel++;
            right(root.left);
        }
        return rightLevel;
    }

    public int left(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null) {
            leftLevel++;
            left(root.left);
        } else if (root.right != null) {
            leftLevel++;
            left(root.right);
        }
        return leftLevel;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
