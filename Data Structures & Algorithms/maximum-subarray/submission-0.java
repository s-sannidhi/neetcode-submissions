class Solution {
    public int maxSubArray(int[] nums) {
        int maxVal = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i] = Math.max(nums[i], nums[i] + nums[i-1]);
            maxVal = Math.max(maxVal, nums[i]);
        }
        return maxVal;

    }
}
