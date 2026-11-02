class Solution {
    int[] cache;
    public int minCostClimbingStairs(int[] cost) {
        cache = new int[cost.length];
        for(int i = 0; i < cache.length; i++){
            cache[i] = -1;
        }
        return Math.min(calc(0, cost), calc(1, cost));
    }

    private int calc(int i, int[] cost){
        if(i >= cost.length){
            return 0;
        }
        if(cache[i] != -1){
            return cache[i];
        }
        cache[i] = cost[i] + Math.min(calc(i+1, cost), calc(i+2, cost));
        return cache[i];
    }
}
