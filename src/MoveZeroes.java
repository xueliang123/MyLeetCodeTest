
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		if(nums == null || nums.length == 0) {
			return;
		}
		int slow, fast;
		for (slow = 0, fast = 0; fast < nums.length; fast++) {
			if (nums[fast] != 0) {
				nums[slow] = nums[fast];
				slow++;
			}
		}
		for (;slow < nums.length; slow++) {
			nums[slow] = 0;
		}
	}
}
