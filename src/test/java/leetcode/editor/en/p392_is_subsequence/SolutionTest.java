package leetcode.editor.en.p392_is_subsequence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void given_ab_adb_then_should_return_true() {
        var result = solution.isSubsequence("ab", "adb");
        assertTrue(result);
    }

    @Test
    void given_axc_ahbgdc_then_should_return_false() {
        var result = solution.isSubsequence("axc", "ahbgdc");
        assertFalse(result);
    }
}