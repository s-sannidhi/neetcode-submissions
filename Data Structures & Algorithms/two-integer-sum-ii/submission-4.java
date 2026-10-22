class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPt = 0;
        int rightPt = numbers.length - 1;
        while(numbers[leftPt] + numbers[rightPt] != target){
            if(numbers[leftPt] + numbers[rightPt] > target){
                rightPt--;
            }
            else if(numbers[leftPt] + numbers[rightPt] < target){
                leftPt++;
            }
        }
        int[] sol = {leftPt + 1, rightPt + 1};
        return sol;
    }
}
