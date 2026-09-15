class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            int currval = nums[i];
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }
                if(currval + nums[j] == target){
                    int[] sol = {i, j};
                    return sol;
                }
            }
        }
        return null;
    }
}
