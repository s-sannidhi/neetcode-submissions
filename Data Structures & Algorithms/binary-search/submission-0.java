class Solution {
    public int search(int[] nums, int target) {
        int leftPt = 0;
        int rightPt = nums.length - 1;
        int mid = (leftPt + rightPt) / 2;
        while(leftPt < rightPt && nums[mid] != target){
            if(nums[mid] < target){
                leftPt = mid + 1;
            }
            else if(nums[mid] > target){
                rightPt = mid - 1;
            }
            mid = (leftPt + rightPt) / 2;
        }
        if(nums[mid] == target){
            return mid;
        }
        return -1;
    }
}
