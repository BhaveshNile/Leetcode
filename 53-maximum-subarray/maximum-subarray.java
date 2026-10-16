
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currentsum = nums[0];

        for (int start = 1; start < nums.length; start++) {
            currentsum = Math.max(nums[start], currentsum + nums[start]);
            maxsum = Math.max(maxsum, currentsum);
        }

        return maxsum;
    }
}
