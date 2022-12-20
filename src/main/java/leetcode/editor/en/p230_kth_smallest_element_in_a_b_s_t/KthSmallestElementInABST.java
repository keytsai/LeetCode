package leetcode.editor.en.p230_kth_smallest_element_in_a_b_s_t;

// P230_KthSmallestElementInABST

//leetcode submit region begin(Prohibit modification and deletion)

import leetcode.editor.en.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;


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
    public int kthSmallest(TreeNode root, int k) {
        traverse(root);
        return list.get(k - 1);
    }

    List<Integer> list = new ArrayList<>();

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
