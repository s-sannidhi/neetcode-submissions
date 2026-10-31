class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> argStack = new Stack<>();
        int finalVal = 0;
        for(String s: tokens){
            if(s.equals("+")){
                finalVal = argStack.pop() + argStack.pop();
                argStack.push(finalVal);
            }
            else if(s.equals("-")){
                finalVal = -(argStack.pop()) + argStack.pop();
                argStack.push(finalVal);
            }
            else if(s.equals("*")){
                finalVal = argStack.pop() * argStack.pop();
                argStack.push(finalVal);
            }
            else if(s.equals("/")){
                int a = argStack.pop();
                int b = argStack.pop();
                finalVal = b/a;
                argStack.push(finalVal);
            }
            else {
                finalVal = Integer.parseInt(s);
                argStack.push(finalVal);
            }
        }
        return finalVal;        
    }
}
