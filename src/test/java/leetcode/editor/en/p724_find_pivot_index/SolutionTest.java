package leetcode.editor.en.p724_find_pivot_index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void given_1_2_1_then_return_3() {
        var result = new Solution().pivotIndex(new int[]{1, 2, 1});

        assertEquals(1, result);
    }
}