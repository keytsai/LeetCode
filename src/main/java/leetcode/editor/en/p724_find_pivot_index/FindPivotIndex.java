package leetcode.editor.en.p724_find_pivot_index;

// P724_FindPivotIndex

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int leftSum = 0;
        for (int num : nums) {
            total += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum  == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
