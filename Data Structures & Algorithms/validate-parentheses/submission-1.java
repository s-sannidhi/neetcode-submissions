class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character c: s.toCharArray()){
            if(c == '[' || c == '{' || c == '('){
                stack.push(c);
            }
            if(c == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return false;
                }
                stack.pop();
            }
            if(c == '}'){
                if(stack.isEmpty() || stack.peek() != '{'){
                    return false;
                }
                stack.pop();
            }
            if(c == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }   
        return true;
    }
}
