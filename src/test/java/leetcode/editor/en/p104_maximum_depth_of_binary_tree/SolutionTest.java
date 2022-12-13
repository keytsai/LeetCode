package leetcode.editor.en.p104_maximum_depth_of_binary_tree;

import leetcode.editor.en.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void twoLevel() {
        // Input: root = [1,null,2]
        // Output: 2
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2));

        assertEquals(2, solution.maxDepth(treeNode));
    }

    @Test
    void twoLevel2() {
        // Input: root = [1,2,null]
        // Output: 2
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), null);

        assertEquals(2, solution.maxDepth(treeNode));
    }

    @Test
    void threeLevel() {
        // Input: root = [3,9,20,null,null,15,7]
        // Output: 3
        TreeNode leftNode = new TreeNode(9);
        TreeNode rightNode = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, leftNode, rightNode);

        assertEquals(3, solution.maxDepth(root));
    }
}