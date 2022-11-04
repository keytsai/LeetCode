package leetcode.editor.en.p1480_running_sum_of_1d_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void given_1_2_then_should_return_1_3() {
        var result = new Solution().runningSum(new int[]{1, 2});

        int[] expect = {1, 3};
        assertEquals(expect[0], result[0]);
        assertEquals(expect[1], result[1]);
    }

    @Test
    void given_2_3_then_should_return_2_5() {
        var result = new Solution().runningSum(new int[]{2, 3});

        int[] expect = {2, 5};
        assertEquals(expect[0], result[0]);
        assertEquals(expect[1], result[1]);
    }
}