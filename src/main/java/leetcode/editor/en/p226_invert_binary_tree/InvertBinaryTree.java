package leetcode.editor.en.p226_invert_binary_tree;

// P226_InvertBinaryTree

//leetcode submit region begin(Prohibit modification and deletion)

import leetcode.editor.en.utils.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root.equals(new TreeNode())) {
            return new TreeNode();
        }
        var rootLeft = root.getLeft();
        var rootRight = root.getRight();
        return new TreeNode(root.getVal(), new TreeNode(rootRight.getVal()), new TreeNode(rootLeft.getVal()));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
