package leetcode.editor.en.p724_find_pivot_index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void given_1_2_1_then_return_3() {
        var result = new Solution().pivotIndex(new int[]{1, 2, 1});
        assertEquals(1, result);
    }

    @Test
    void given_1_7_3_6_5_6_then_return_3() {
        var result = new Solution().pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        assertEquals(3, result);
    }

    @Test
    void given_1_2_3_then_return_minus_1() {
        var result = new Solution().pivotIndex(new int[]{1, 2, 3});
        assertEquals(-1, result);
    }
}