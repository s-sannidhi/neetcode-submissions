class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int max = 0;
        for(int i = 0; i < charArray.length; i++){
            int sum = 0;
            int rightPt = i+1;
            Set<Character> charSet = new HashSet<Character>();
            charSet.add(charArray[i]);
            sum++;
            while(rightPt < charArray.length && !charSet.contains(charArray[rightPt])){
                sum++;
                charSet.add(charArray[rightPt]);
                rightPt++;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;    
    }
}
