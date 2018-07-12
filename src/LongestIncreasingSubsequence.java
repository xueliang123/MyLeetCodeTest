//https://leetcode.com/problems/longest-increasing-subsequence/discuss/74824/JavaPython-Binary-search-O(nlogn)-time-with-explanation
public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int res = 1;
        int[] tail = new int[nums.length];
        tail[0] = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] > tail[res - 1]) {
                tail[res++] = nums[i];
            } else {
                int start = 0, end = res - 1;
                while (start < end) {
                    int mid = (start + end) / 2;
                    if (tail[mid] < nums[i]) {
                        start = mid + 1;
                    } else {
                        end = mid;
                    }
                }
                tail[start] = nums[i];
            }
        }
        return res;
    }
}
