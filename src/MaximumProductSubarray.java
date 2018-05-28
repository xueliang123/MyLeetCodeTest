public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int curMax = nums[0], curMin = curMax;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = curMax;
                curMax = curMin;
                curMin = tmp;
            }
            curMax = Math.max(nums[i], nums[i] * curMax);
            curMin = Math.min(nums[i], nums[i] * curMin);
            max = Math.max(curMax, max);
        }
        return max;
    }

}
