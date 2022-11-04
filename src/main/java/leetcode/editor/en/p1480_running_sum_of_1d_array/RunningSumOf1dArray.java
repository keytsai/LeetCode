package leetcode.editor.en.p1480_running_sum_of_1d_array;

// P1480_RunningSumOf1dArray

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                nums[i] = nums[i] + nums[i - 1];
            }
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
