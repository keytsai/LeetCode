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

    @Test
    void given_3_1_2_10_1_then_should_return_3_4_6_16_17() {
        var result = new Solution().runningSum(new int[]{3,1,2,10,1});

        int[] expect = {3,4,6,16,17};
        assertEquals(expect[0], result[0]);
        assertEquals(expect[1], result[1]);
        assertEquals(expect[2], result[2]);
        assertEquals(expect[3], result[3]);
        assertEquals(expect[4], result[4]);
    }
}