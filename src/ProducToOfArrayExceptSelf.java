
public class ProducToOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
		int[] res = new int[length];
		int tmpPrefix = 1;
		for (int i = 0; i < length; i++) {
			res[i] = tmpPrefix;
			tmpPrefix *= nums[i];
		}
		int tmpSuffix = 1;
		for (int i = length - 1;i >= 0; i--) {
			res[i] *= tmpSuffix;
			tmpSuffix *= nums[i];
		}
		return res;
    }
}
