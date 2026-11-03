class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        sol(nums, new ArrayList<Integer>(), 0);
        return res;
    }
    private void sol(int[] nums, ArrayList<Integer> curList, int index){
        res.add(curList);
        for(int i = index; i < nums.length; i++){
            curList.add(nums[i]);
            sol(nums, new ArrayList<>(curList), i + 1);
            curList.remove(curList.size() - 1);
        }
    }

}
