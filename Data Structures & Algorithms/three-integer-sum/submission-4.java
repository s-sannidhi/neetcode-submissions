class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            if(i > 0 && a == nums[i-1]){
                continue;
            }
            int leftPt = i + 1;
            int rightPt = nums.length - 1;
            while(leftPt < rightPt){
                int sum = a + nums[leftPt] + nums[rightPt];
                if(sum > 0){
                    rightPt--;
                }
                else if(sum < 0){
                    leftPt++;
                }
                else{
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(a);
                    triplet.add(nums[leftPt]);
                    triplet.add(nums[rightPt]);
                    sol.add(triplet);
                    leftPt++;
                    while(nums[leftPt] == nums[leftPt - 1] && leftPt < rightPt){
                        leftPt++;
                    }
                }
            }

        }
        return sol;

    }
}