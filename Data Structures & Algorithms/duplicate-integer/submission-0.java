class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> the_set = new HashSet<Integer>();
        for(int i: nums){
            if(the_set.contains(i)){
                return true;
            }
            the_set.add(i);
        }
        return false;
    }
}