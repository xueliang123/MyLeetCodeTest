/**
 * Created by Administrator on 2015/5/28.
 */
public class KthLargestElementinanArray1 {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || k > nums.length) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (true) {
            int index = partition(nums, low, high);
            if (index > k - 1) {
                high = index - 1;
            } else if (index < k - 1){
                low = index + 1;
            } else {
                return nums[index];
            }
        }
    }

    public int partition(int[] nums, int low, int high) {
        int pivotKey = nums[low];
        while (low < high) {
            while (low < high && nums[high] <= pivotKey) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] >= pivotKey) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = pivotKey;
        return low;
    }
}
