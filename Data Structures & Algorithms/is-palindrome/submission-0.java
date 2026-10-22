class Solution {
    public boolean isPalindrome(String s) {
        char[] sArray = s.toCharArray();
        int left = 0;
        int right = sArray.length - 1;
        while(left <= right){
            if(!Character.isLetterOrDigit(sArray[left])){
                left++;
            } else if (!Character.isLetterOrDigit(sArray[right])) {
                right--;
            } else {
                if(Character.toLowerCase(sArray[left]) != Character.toLowerCase(sArray[right])){
                    return false;
                }
                left++;
                right--;
            }

        }
        return true;    
    }
}
