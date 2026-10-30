class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++){
            maxHeap.offer(stones[i]);
        }
        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x != y){
                maxHeap.offer(x - y);
            }
        }
        if(maxHeap.isEmpty()){
            return 0;
        }
        return maxHeap.poll();
    }
}
