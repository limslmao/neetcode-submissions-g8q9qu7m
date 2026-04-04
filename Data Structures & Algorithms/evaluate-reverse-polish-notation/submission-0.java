class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens){
            if(s.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                int sum = a+b;
                stack.push(sum);
            }else if(s.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                int sum = b-a;
                stack.push(sum);
            }else if(s.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                int sum = a*b;
                stack.push(sum);
            }else if(s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                int sum = b/a;
                stack.push(sum);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        
        return stack.pop();
    }
}
