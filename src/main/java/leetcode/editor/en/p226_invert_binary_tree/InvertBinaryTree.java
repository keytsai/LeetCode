package leetcode.editor.en.p226_invert_binary_tree;

// P226_InvertBinaryTree

//leetcode submit region begin(Prohibit modification and deletion)

import leetcode.editor.en.utils.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }

}

// Definition for a binary tree node.

//leetcode submit region end(Prohibit modification and deletion)
