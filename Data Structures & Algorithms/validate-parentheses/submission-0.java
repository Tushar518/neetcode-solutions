class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> bracketMap = new HashMap<>();
        bracketMap.put(')','(');
        bracketMap.put('}','{');
        bracketMap.put(']','[');

        Deque<Character> stack = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if (bracketMap.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != bracketMap.get(c)) {
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
