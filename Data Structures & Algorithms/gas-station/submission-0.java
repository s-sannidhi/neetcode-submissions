class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(Arrays.stream(gas).sum() < Arrays.stream(cost).sum()){
            return -1;
        }
        int gasTotal = 0;
        int res = 0;
        for(int i = 0; i < gas.length; i++){
            gasTotal += gas[i] - cost[i];
            if(gasTotal < 0){
                res = i + 1;
                gasTotal = 0;
            }
        }
        return res;
    }
}
