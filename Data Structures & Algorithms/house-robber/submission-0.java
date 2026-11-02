class Solution {
    int[] cache;
    public int rob(int[] nums) {
        cache = new int[nums.length];
        for(int i = 0; i < cache.length; i++){
            cache[i] = -1;
        }
        return Math.max(robby(0, nums), robby(1, nums));
    }
    private int robby(int i, int[] nums){
        if(i < 0 || i >= nums.length){
            return 0;
        }
        if(cache[i] != -1){
            return cache[i];
        }
        int running_total = 0;
        for(int j = i + 2; j < nums.length; j++){
            running_total = Math.max(running_total, robby(j, nums));
        }
        cache[i] = nums[i] + running_total;
        return cache[i];
    }
}
