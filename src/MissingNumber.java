
public class MissingNumber {
	public int missingNumber(int[] nums) {
        int n = nums.length;
        int tmp = 0;
        for (int i = 0; i <= n; i++) {
        	tmp ^= i;
        }
        for (int i = 0; i < n; i++) {
        	tmp ^= nums[i];
        }
        return tmp;
    }
}
