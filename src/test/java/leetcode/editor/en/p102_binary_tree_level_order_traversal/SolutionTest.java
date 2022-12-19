package leetcode.editor.en.p102_binary_tree_level_order_traversal;

import leetcode.editor.en.utils.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void given_null() {
        assertThat(solution.levelOrder(null)).isNull();
    }

    @Test
    void given_one_node() {
        var root = TreeNode.createBinaryTree(1);
        assertThat(solution.levelOrder(root)).isEqualTo(createLevelOrderList(new Integer[]{1}));
    }

    private List<List<Integer>> createLevelOrderList(Integer[]... arr) {
        List<List<Integer>> list = new ArrayList<>();
        for (var i : arr) {
            list.add(Arrays.asList(i));
        }
        return list;
    }

}