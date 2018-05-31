public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length < 3) {
            int res = 0;
            for (int i : nums) {
                res = Math.max(res, i);
            }
            return res;
        }
        int a, b;
        int preNotRobed = nums[0], preRobed = 0;
        for (int i = 2; i < nums.length - 1; i++) {
            int tmp = preRobed;
            preRobed = preNotRobed + nums[i];
            preNotRobed = Math.max(preNotRobed, tmp);
        }
        a = Math.max(preNotRobed, preRobed);
        preNotRobed = 0;
        preRobed = 0;
        for (int i = 1; i < nums.length; i++) {
            int tmp = preRobed;
            preRobed = preNotRobed + nums[i];
            preNotRobed = Math.max(preNotRobed, tmp);
        }
        b = Math.max(preNotRobed, preRobed);
        return Math.max(a, b);
    }
}
