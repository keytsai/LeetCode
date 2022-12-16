package leetcode.editor.en.utils;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createBinaryTree(Integer... arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        queue.offer(root);
        int index = 1;
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (index < arr.length) {
                Integer leftVal = arr[index++];
                if (leftVal != null) {
                    treeNode.left = new TreeNode(leftVal);
                    queue.offer(treeNode.left);
                }
            }
            if (index < arr.length) {
                Integer rightVal = arr[index++];
                if (rightVal != null) {
                    treeNode.right = new TreeNode(rightVal);
                    queue.offer(treeNode.right);
                }
            }
        }
        return root;
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