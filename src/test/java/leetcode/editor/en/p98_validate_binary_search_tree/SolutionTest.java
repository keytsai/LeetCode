package leetcode.editor.en.p98_validate_binary_search_tree;

import leetcode.editor.en.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void given_three_node() {
        var root = TreeNode.createBinaryTree(2, 1, 3);
        var result = solution.isValidBST(root);
        assertThat(result).isTrue();
    }

    @Test
    void given_222_node() {
        var root = TreeNode.createBinaryTree(2, 2, 2);
        var result = solution.isValidBST(root);
        assertThat(result).isFalse();
    }
}