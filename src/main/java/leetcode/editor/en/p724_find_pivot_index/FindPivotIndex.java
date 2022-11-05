package leetcode.editor.en.p724_find_pivot_index;

// P724_FindPivotIndex

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int pivotIndex(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            int beginSum = 0;
            int endSum = 0;
            while (j > 0) {
                beginSum += nums[i - 1];
                j--;
            }
            int k = i;
            while (k < nums.length -1) {
                endSum += nums[i + 1];
                k++;
            }
            if (beginSum == endSum) {
                result = i;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
