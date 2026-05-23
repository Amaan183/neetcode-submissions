class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        HashMap<Character, Character> hm= new HashMap<>();
        hm.put(')','(');
        hm.put(']','[');
        hm.put('}','{');

        for(char c : s.toCharArray())
        {
            if(hm.containsValue(c)){
                stack.push(c);
            }
            else{
                if(!stack.isEmpty() && stack.peek() == hm.get(c))
                {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
