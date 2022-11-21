package leetcode.editor.en.p392_is_subsequence;

// P392_IsSubsequence

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sCount = 0;
        int tCount = 0;
        while (sCount < s.getBytes().length && tCount < t.getBytes().length) {
            if (s.getBytes()[sCount] == t.getBytes()[tCount]) {
                sCount++;
            }
            tCount++;
        }
        return sCount == s.getBytes().length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
