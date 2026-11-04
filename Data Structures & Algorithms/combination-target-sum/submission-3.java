class Solution {
    ArrayList<List<Integer>> sol = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        solve(nums, target, new ArrayList<>(), 0);     
        return sol;
    }

    private void solve(int[] nums, int curLeft, ArrayList<Integer> runningList, int j){
        if(curLeft == 0){
            sol.add(runningList);
            return;
        }
        else if(curLeft < 0){
            return;
        }
        for(int i = j; i < nums.length; i++){
            runningList.add(nums[i]);
            solve(nums, curLeft - nums[i], new ArrayList<>(runningList), i);
            runningList.remove(runningList.size() - 1);
        }
    }
}
