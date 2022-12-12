package leetcode.editor.en.p226_invert_binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;
    private TreeNode root;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void given_3_node() {
        // Input: root = [2,1,3]
        // Output: [2,3,1]
        root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

        var result = solution.invertTree(root);
        var expect = new TreeNode(2, new TreeNode(3), new TreeNode(1));

        assertEquals(expect, result);
    }

    @Test
    void given_no_node() {
        // Input: root = []
        // Output: []
        var result = solution.invertTree(null);

        assertNull(result);
    }

    @Test
    void given_1_node() {
        // Input: root = [1]
        // Output: []
        root = new TreeNode(1);

        var result = solution.invertTree(root);

        assertEquals(new TreeNode(1), result);
    }

    @Test
    void given_2_node() {
        // Input: root = [1]
        // Output: []
        root = new TreeNode(1, new TreeNode(2), null);

        var result = solution.invertTree(root);

        assertEquals(new TreeNode(1, null, new TreeNode(2)), result);
    }

    @Test
    void given_7_node() {
        // Input: root = [4,2,7,1,3,6,9]
        // Output: [4,7,2,9,6,3,1]
        var leftNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        var rightNode = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        root = new TreeNode(4, leftNode, rightNode);

        var result = solution.invertTree(root);

        var expectLeftNode = new TreeNode(7, new TreeNode(9), new TreeNode(6));
        var expectRightNode = new TreeNode(2, new TreeNode(3), new TreeNode(1));
        var expect = new TreeNode(4, expectLeftNode, expectRightNode);

        assertEquals(expect, result);
    }
}