package leetcode.editor.en.p226_invert_binary_tree;

// P226_InvertBinaryTree

//leetcode submit region begin(Prohibit modification and deletion)

import java.util.Objects;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        } else if (root.left == null) {
            return root;
        }
        return invertOneTree(root);
    }

    public TreeNode invertOneTree(TreeNode root) {
        var leftNode = root.left;
        var rightNode = root.right;
        if (leftNode.left == null) {
            return new TreeNode(root.val, new TreeNode(rightNode.val), new TreeNode(leftNode.val));
        } else {
            return new TreeNode(root.val, invertOneTree(rightNode), invertOneTree(leftNode));
        }
    }

    public boolean hasNode(TreeNode treeNode) {
        return treeNode.left.left != null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
