/**
 * Created by xueliang on 15-5-12.
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int low = 0, high = 0;
        int res = nums.length + 1;
        int tmp = nums[0];
        while (high < nums.length && low <= high) {
            if (tmp < s) {
                high++;
                if (high < nums.length) {
                    tmp += nums[high];
                }
            }
            else {
                res = Math.min(res, high - low + 1);
                tmp -= nums[low];
                low ++;
            }
        }
        return res == nums.length + 1 ? 0 : res;
    }
}
