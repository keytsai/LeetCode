package leetcode.editor.en.p230_kth_smallest_element_in_a_b_s_t;

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
    void return_1() {
        var root = TreeNode.createBinaryTree(3, 1, 4, null, 2);
        var result = solution.kthSmallest(root, 1);
        assertThat(result).isEqualTo(1);
    }
}