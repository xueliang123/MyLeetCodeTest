/**
 * Created by Administrator on 2015/5/28.
 */
public class KthLargestElementinanArray2 {
    public int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        for (int i = (length - 2) / 2; i >= 0; i--) {
            heapAdjust(nums, length, i);
        }
        int count = 1;
        while (count < k) {
            nums[0] = nums[length - 1];
            length--;
            heapAdjust(nums, length, 0);
            count++;
        }
        return nums[0];
    }

    public void heapAdjust (int[] nums, int length, int tar) {
        int temp = nums[tar];
        for (int i = tar * 2 + 1; i < length; i = i * 2 + 1) {
            if (i + 1 < length && nums[i] < nums[i + 1]) {
                i++;
            }
            if (temp >= nums[i])
                break;
            nums[tar] = nums[i];
            tar = i;
        }
        nums[tar] = temp;
    }
}
