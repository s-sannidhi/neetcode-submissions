class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Double> minHeap = new PriorityQueue<>();
        HashMap<Double, ArrayList<int[]>> coords = new HashMap<>();
        for(int i = 0; i < points.length; i++){
            int a = points[i][0];
            int b = points[i][1];
            double c = Math.sqrt((double)a*a + (double)b*b);
            minHeap.offer(c);
            if(coords.containsKey(c)){
                coords.get(c).add(points[i]);
            }
            else{
                ArrayList<int[]> temp = new ArrayList<>();
                temp.add(points[i]);
                coords.put(c, temp);
            }
        }
        int[][] sol = new int[k][];
        k--;
        while(k >= 0){
            ArrayList<int[]> cur = coords.get(minHeap.poll());
            sol[k] = cur.get(0);
            cur.remove(0);
            k--;
        }
        return sol;

    }
}
