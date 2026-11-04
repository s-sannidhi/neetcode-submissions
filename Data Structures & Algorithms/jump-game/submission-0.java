class Solution {
    public boolean canJump(int[] nums) {
        Set<Integer> canReachEnd = new HashSet<>();
        canReachEnd.add(nums.length - 1);
        for(int i = nums.length - 2; i >= 0; i--){
            for(Integer j: canReachEnd){
                if(i + nums[i] >= j){
                    canReachEnd.add(i);
                    break;
                }
            }
        }
        if(canReachEnd.contains(0)){
            return true;
        }        
        return false;
    }
}
