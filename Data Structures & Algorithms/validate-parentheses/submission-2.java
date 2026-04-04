class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        char[] c = s.toCharArray();
        for(char ch: c){
            System.out.println(ch);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                char takeOut;
                if(!stack.isEmpty()){
                    takeOut = stack.pop();
                }else{
                    return false;
                }
                System.out.println(takeOut);
                if((ch == ')' && takeOut != '(')
                || (ch == ']' && takeOut != '[')
                || (ch == '}' && takeOut != '{')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
