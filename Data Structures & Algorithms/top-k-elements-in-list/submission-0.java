class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(freqs.containsKey(nums[i])){
                freqs.put(nums[i], freqs.get(nums[i]) + 1);
            }
            else{
                freqs.put(nums[i], 1);
            }
        }       
        int[] sol = new int[k];            
        for(int i = 0; i < k; i++){
            int highest = 0;
            int stored = -256;
            for(Integer j: freqs.keySet()){
                if((int) freqs.get(j) > highest){
                    stored = j;
                    highest = freqs.get(Integer.valueOf(j));
                }
            }
            sol[i] = stored;
            freqs.remove(stored);
        }
        return sol;
    }
}
