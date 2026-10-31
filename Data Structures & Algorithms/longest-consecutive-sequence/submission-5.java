class Solution {
    public int longestConsecutive(int[] nums) {
        int[] pref = new int[nums.length];
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            pref[i] = nums[i] - nums[i-1];
        }
        int max = 0;
        int count = 1;
        for(int i = 0; i < pref.length; i++){
            if(pref[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else if (pref[i] != 0){
                count = 1;
            }
        }
        if(count > max){
            max = count;
        }
        if(nums.length == 0){
            return 0;
        }
        return max;

    }
}
