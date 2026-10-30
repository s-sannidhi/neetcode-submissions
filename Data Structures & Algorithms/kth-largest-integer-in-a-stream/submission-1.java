class KthLargest {
    private PriorityQueue<Integer> heap;
    private int maxSize;
    public KthLargest(int k, int[] nums) {
        this.maxSize = k;
        this.heap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            heap.offer(nums[i]);
            if(heap.size() > maxSize){
                heap.poll();
            }
        }           
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size() > maxSize){
            heap.poll();
        }
        return heap.peek();
    }
}
