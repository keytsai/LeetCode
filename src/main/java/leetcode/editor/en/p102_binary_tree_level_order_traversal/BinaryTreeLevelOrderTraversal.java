package leetcode.editor.en.p102_binary_tree_level_order_traversal;

// P102_BinaryTreeLevelOrderTraversal

//leetcode submit region begin(Prohibit modification and deletion)

import leetcode.editor.en.utils.TreeNode;

import java.util.*;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> nodeList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = Optional.of(Objects.requireNonNull(queue.poll())).get();
                nodeList.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            list.add(nodeList);

        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
