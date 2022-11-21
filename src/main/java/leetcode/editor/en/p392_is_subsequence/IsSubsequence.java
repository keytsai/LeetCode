package leetcode.editor.en.p392_is_subsequence;

// P392_IsSubsequence

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sCount = 0;
        int tCount = 0;
        for (var sNumber : s.getBytes()) {
            for (var tNumber : t.getBytes()) {
                if (sNumber == tNumber) {
                    break;
                }
                tCount++;
            }
            sCount++;
        }


        return sCount >= tCount;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
