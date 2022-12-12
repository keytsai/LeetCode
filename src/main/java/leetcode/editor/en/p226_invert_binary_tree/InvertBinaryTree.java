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
        return invertOneTree(root);
    }

    public TreeNode invertOneTree(TreeNode root) {
        var leftNode = root.getLeft();
        var rightNode = root.getRight();
        if (leftNode.getLeft() == null) {
            return new TreeNode(root.getVal(), new TreeNode(rightNode.getVal()), new TreeNode(leftNode.getVal()));
        } else {
            return new TreeNode(root.getVal(), invertOneTree(rightNode), invertOneTree(leftNode));
        }
    }

    public boolean hasNode(TreeNode treeNode) {
        return treeNode.getLeft().getLeft() != null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
