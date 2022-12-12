package leetcode.editor.en.p226_invert_binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import leetcode.editor.en.utils.TreeNode;

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
}