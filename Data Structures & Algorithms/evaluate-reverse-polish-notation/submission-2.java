class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String t : tokens){
            if("+-*/".contains(t)){
                int b=stack.pop(), a=stack.pop();
                if(t.equals("+")) stack.push(a+b);
                else if(t.equals("-")) stack.push(a-b);
                else if(t.equals("*")) stack.push(a*b);
                else stack.push(a/b);
            }else{
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}
