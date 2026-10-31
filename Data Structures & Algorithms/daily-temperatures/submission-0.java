class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int i = 0; 
        int j = 1;
        while(i < temperatures.length){
            if(j == temperatures.length){
                i++;
                j = i+1;
            }
            else if(temperatures[j] > temperatures[i]){
                res[i] = j - i;
                i++;
                j = i+1;
            }
            else {
                j++;
            }

        }
        return res;
        
    }
}
