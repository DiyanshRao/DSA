class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for(int i =0; i < s.length(); i++){
            Character ch = s.charAt(i);

            if(map.containsKey(ch)){
                stack.push(map.get(ch));
                continue;
            }

            if(stack.isEmpty() || stack.peek() != ch){
                return false;
            }

            stack.pop();


        }

        return stack.isEmpty();
    }
}
