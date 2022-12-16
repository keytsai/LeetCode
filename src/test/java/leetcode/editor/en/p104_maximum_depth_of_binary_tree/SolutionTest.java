package leetcode.editor.en.p104_maximum_depth_of_binary_tree;

import leetcode.editor.en.utils.TreeNode;
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
    void twoLevel() {
        // Input: root = [1,null,2]
        // Output: 2
        root = TreeNode.createBinaryTree(1, null, 2);

        assertEquals(2, solution.maxDepth(root));
    }

    @Test
    void twoLevel2() {
        // Input: root = [1,2,null]
        // Output: 2
        root = TreeNode.createBinaryTree(1, 2, null);

        assertEquals(2, solution.maxDepth(root));
    }

    @Test
    void threeLevel() {
        // Input: root = [3,9,20,null,null,15,7]
        // Output: 3
        root = TreeNode.createBinaryTree(3, 9, 20, null, null, 15, 7);

        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void zeroLevel() {
        // Input: root = []
        // Output: 0
        assertEquals(0, solution.maxDepth(null));
    }

    @Test
    void threeLevel2() {
        // Input: root = [1,2,3,4,5]
        // Output: 3
        root = TreeNode.createBinaryTree(1, 2, 3, 4, 5);

        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void threeLevel3() {
        // Input: root = [1,2,3,4,null,null,5]
        // Output: 3
        root = TreeNode.createBinaryTree(1, 2, 3, 4, null, null, 5);

        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void fourLevel() {
        // Input: root = [3,4,5,-7,-6,null,null,-7,null,-5,null,null,null,-4]
        // Output: 5
        root = TreeNode.createBinaryTree(3, 4, 5, -7, -6, null, null, -7, null, -5, null, null, null, -4);

        assertEquals(5, solution.maxDepth(root));
    }

}