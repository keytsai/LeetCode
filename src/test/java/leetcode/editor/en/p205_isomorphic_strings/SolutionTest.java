package leetcode.editor.en.p205_isomorphic_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void given_egg_add_then_should_return_true() {
        var result = new Solution().isIsomorphic("egg", "add");
        assertTrue(result);
    }
}