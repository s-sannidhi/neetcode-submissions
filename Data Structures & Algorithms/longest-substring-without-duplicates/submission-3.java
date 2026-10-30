class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            int sum = 0;
            int rightPt = i+1;
            Set<Character> charSet = new HashSet<Character>();
            charSet.add(s.charAt(i));
            sum++;
            while(rightPt < s.length() && !charSet.contains(s.charAt(rightPt))){
                sum++;
                charSet.add(s.charAt(rightPt));
                rightPt++;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;    
    }
}
