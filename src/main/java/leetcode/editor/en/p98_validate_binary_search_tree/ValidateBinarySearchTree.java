package leetcode.editor.en.p98_validate_binary_search_tree;

// P98_ValidateBinarySearchTree

//leetcode submit region begin(Prohibit modification and deletion)

import leetcode.editor.en.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

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

    List<Integer> list = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        traverse(root);
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1) {
                continue;
            }
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }

}
//leetcode submit region end(Prohibit modification and deletion)
