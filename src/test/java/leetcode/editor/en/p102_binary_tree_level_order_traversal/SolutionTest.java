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
        assertThat(solution.levelOrder(null)).isEqualTo(new ArrayList<>());
    }

    @Test
    void given_one_node() {
        var root = TreeNode.createBinaryTree(1);
        assertThat(solution.levelOrder(root)).isEqualTo(createLevelOrderList(new Integer[]{1}));
    }

    @Test
    void three_list() {
        var root = TreeNode.createBinaryTree(3, 9, 20, null, null, 15, 7);
        assertThat(solution.levelOrder(root)).isEqualTo(createLevelOrderList(new Integer[]{3}, new Integer[]{9, 20}, new Integer[]{15, 7}));
    }

    private List<List<Integer>> createLevelOrderList(Integer[]... arr) {
        List<List<Integer>> list = new ArrayList<>();
        for (var i : arr) {
            list.add(Arrays.asList(i));
        }
        return list;
    }

}