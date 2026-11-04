class Solution {
    ArrayList<List<Integer>> sol = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        solve(nums, new ArrayList<>());
        return sol;
    }
    private void solve(int[] nums, ArrayList<Integer> curPerm){
        if(curPerm.size() == nums.length){
            sol.add(curPerm);
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!curPerm.contains(nums[i])){
                curPerm.add(nums[i]);
                solve(nums, new ArrayList<>(curPerm));
                curPerm.remove(curPerm.size() - 1);
            }
        }
    }

}
